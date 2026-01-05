class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        int ans = 1;

        for (int i = 0; i < n; i++) {     // pointer i
            dp[i] = 1;

            for (int j = 0; j < i; j++) { // pointer j
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
