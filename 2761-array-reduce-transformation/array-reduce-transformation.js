var reduce = function(nums, fn, init) {
    let val = init;   // start with initial value
    for (let i = 0; i < nums.length; i++) {
        val = fn(val, nums[i]);  // apply fn on each element
    }
    return val;  // return the final reduced value
};
