
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 3 == 0) {
                continue;
            }

            // try decreasing by 1
            if ((nums[i] - 1) % 3 == 0) {
                count++;
                continue;
            }

            // try increasing by 1
            if ((nums[i] + 1) % 3 == 0) {
                count++;
                continue;
            }

            // if none works → need 2 operations
            count += 2;
        }

        return count;
    }
}
