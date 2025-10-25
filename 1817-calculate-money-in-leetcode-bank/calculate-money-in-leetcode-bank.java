class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int weekStart = 1; // Monday deposit start

        while (n > 0) {
            for (int day = 0; day < 7 && n > 0; day++) {
                total += weekStart + day;
                n--;
            }
            weekStart++;
        }

        return total;
    }
}
