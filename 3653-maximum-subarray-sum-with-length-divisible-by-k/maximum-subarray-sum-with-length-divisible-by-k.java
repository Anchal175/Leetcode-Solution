// class Solution {
//     public long maxSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         long ans = Long.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             long sum = 0;

//             for (int j = i; j < n; j++) {
//                 sum += nums[j];         // subarray sum
//                 int len = j - i + 1;    // subarray length

//                 if (len % k == 0) {     // divisible by k
//                     ans = Math.max(ans, sum);
//                 }
//             }
//         }

//         return ans;
//     }
// }
class Solution {

    private static final long LIMIT = 9007199254740991L;  // 2^53 - 1

    private long clamp(long x) {
        if (x > LIMIT) return LIMIT;
        if (x < -LIMIT) return -LIMIT;
        return x;
    }

    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, LIMIT);

        minPrefix[k - 1] = 0;

        long prefix = 0;
        long ans = -LIMIT;

        for (int i = 0; i < n; i++) {
            prefix = clamp(prefix + nums[i]);
            int r = i % k;

            ans = Math.max(ans, prefix - minPrefix[r]);

            minPrefix[r] = Math.min(minPrefix[r], prefix);
        }

        return ans;
    }
}
