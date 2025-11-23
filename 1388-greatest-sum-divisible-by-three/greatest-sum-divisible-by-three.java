class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int x : nums) {
            int[] temp = dp.clone();
            for (int r = 0; r < 3; r++) {
                if (temp[r] == Integer.MIN_VALUE) continue; // skip impossible state
                int newSum = temp[r] + x;
                int newR = (newSum % 3 + 3) % 3;            // make remainder non-negative
                dp[newR] = Math.max(dp[newR], newSum);
            }
        }

        return dp[0];
    }
}
