// /
class Solution {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;
        while (true) {
            if (isBalanced(num)) return num;
            num++; // <-- yeh line zaruri hai
        }
    }

    private boolean isBalanced(int num) {
        String s = String.valueOf(num);
        int[] count = new int[10];

        for (char c : s.toCharArray()) {
            count[c - '0']++;
        }

        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (count[d] != d) return false;
        }

        return true;
    }
}
