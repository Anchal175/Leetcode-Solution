class Solution {
    public boolean hasSameDigits(String s) {
        int[] m = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            m[i] = s.charAt(i) - '0';
        }

        while (m.length > 2) {
            int[] n = new int[m.length - 1];
            for (int i = 0; i < m.length - 1; i++) {
                n[i] = (m[i] + m[i + 1]) % 10;
            }
            m = n;
        }

        return m[0] == m[1];
    }
}
