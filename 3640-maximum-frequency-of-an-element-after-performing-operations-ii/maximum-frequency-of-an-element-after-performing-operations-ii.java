class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {

        // frequency of original numbers
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // difference map using TreeMap so keys are sorted
        TreeMap<Integer, Integer> diff = new TreeMap<>();
        for (int num : nums) {
            int start = num - k;
            int endExclusive = num + k + 1; // end is exclusive
            diff.put(start, diff.getOrDefault(start, 0) + 1);
            diff.put(endExclusive, diff.getOrDefault(endExclusive, 0) - 1);
        }

        // IMPORTANT: ensure we also evaluate at all original numbers
        // so that values like 20 (which may not be a diff key) are checked.
        for (int x : freq.keySet()) {
            diff.putIfAbsent(x, 0);
        }

        int active = 0;
        int ans = 0;

        for (Map.Entry<Integer, Integer> e : diff.entrySet()) {
            int x = e.getKey();
            active += e.getValue(); // update active ranges at position x

            int already = freq.getOrDefault(x, 0);
            int convertible = active - already; // how many (not already x) can become x
            if (convertible < 0) convertible = 0;

            int canAdd = Math.min(numOperations, convertible);
            ans = Math.max(ans, already + canAdd);
        }

        return ans;
    
    }
}