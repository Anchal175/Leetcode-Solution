class Solution {
    public int smallestNumber(int n) {
        int k = 1;
        while (true) {                  // repeat until we find answer
            int m = (1 << k) - 1;       // 2^k - 1
            if (m >= n) {               // jaise hi bada ya equal mile
                return m;               // wahi answer hai
            }
            k++;                        // warna next try karo
        }
    }
}
