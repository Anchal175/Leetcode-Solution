import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        // Step 1: Find max candies
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Step 2: Check for each kid
        for (int i = 0; i < candies.length; i++) {
            int m = candies[i] + extraCandies;
            if (m >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
