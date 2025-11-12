class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count1 = 0;

        // Step 1: check kitne 1 hain
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) count1++;
        }

        // Agar already 1 hain, to simple case
        if (count1 > 0) return n - count1;

        // Step 2: find smallest subarray jiska GCD = 1 ho
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        // Agar aisa subarray nahi mila to -1
        if (minLen == Integer.MAX_VALUE) return -1;

        // Step 3: total operations
        return (minLen - 1) + (n - 1);
    }

    // Helper method to find gcd
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
