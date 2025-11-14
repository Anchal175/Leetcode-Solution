class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // Step 1: Find all frequencies brute force
        int n = arr.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            freq[i] = count;
        }

        // Step 2: Check if any two frequencies are same
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j] && freq[i] == freq[j]) {
                    return false;  // frequency duplicate found
                }
            }
        }

        return true;
    }
}
