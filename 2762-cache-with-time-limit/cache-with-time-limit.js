var TimeLimitedCache = function() {
    
    this.cache = new Map();
    
    
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();

    const exists = this.cache.has(key) && this.cache.get(key).expire > now;

    this.cache.set(key, { value, expire: now + duration });

    return exists; 
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();

    if (!this.cache.has(key)) return -1; 

    const item = this.cache.get(key);

    if (item.expire <= now) {
      this.cache.delete(key);
      return -1;
    }  
    return item.value;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let validCount = 0;

    for (const [key, item] of this.cache) {
      if (item.expire > now) validCount++;
      else this.cache.delete(key); 
    }

    return validCount;
  
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */