class Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        for (int x : nums) sum += x;

        long rem = sum % k;
        
        return (int) rem;  // since we only subtract 1 each time
    }
}
