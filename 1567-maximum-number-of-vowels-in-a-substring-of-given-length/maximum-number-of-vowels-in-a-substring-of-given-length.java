class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        
        char[] arr = s.toCharArray();

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(arr[i])) {
                count++;
            }
        }
        max = count;

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                count++;
            }
            if (isVowel(arr[i - k])) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

