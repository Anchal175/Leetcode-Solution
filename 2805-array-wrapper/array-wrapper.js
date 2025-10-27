class ArrayWrapper {
    constructor(nums) {
        this.nums = nums;
    }

    // when + operator is used
    valueOf() {
        return this.nums.reduce((sum, num) => sum + num, 0);
    }

    // when String() or template literal is used
    toString() {
        return `[${this.nums.join(',')}]`;
    }
}
