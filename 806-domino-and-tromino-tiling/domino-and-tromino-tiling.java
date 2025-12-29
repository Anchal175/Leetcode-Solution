class Solution {
    public int numTilings(int n) {

        int MOD = 1_000_000_007;

        if (n <= 2) return n;

        long fullPrev2 = 1; // full[0]
        long fullPrev1 = 1; // full[1]
        long partialPrev = 0;

        for (int i = 2; i <= n; i++) {
            long fullCurr = (fullPrev1 + fullPrev2 + 2 * partialPrev) % MOD;
            long partialCurr = (partialPrev + fullPrev2) % MOD;

            fullPrev2 = fullPrev1;
            fullPrev1 = fullCurr;
            partialPrev = partialCurr;
        }

        return (int) fullPrev1;
    }
}
