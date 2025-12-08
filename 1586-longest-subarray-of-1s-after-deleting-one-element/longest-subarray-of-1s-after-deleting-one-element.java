// class Solution {
//     public int longestSubarray(int[] nums) {
        
//     }
// }
class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // agar zyada zero aa gaye to window shrink karo
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // -1 isliye ki ek element delete karna compulsory hai
            maxLen = Math.max(maxLen, right - left + 1 - 1);
        }

        return maxLen;
    }
}
