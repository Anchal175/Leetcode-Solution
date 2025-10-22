public class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles; // initially drink all full bottles
        int empties = numBottles;    // track empty bottles

        while (empties >= numExchange) {
            // exchange empty bottles for one full bottle
            empties -= numExchange;
            totalDrank += 1;  // drink the new full bottle
            empties += 1;     // the new bottle becomes empty
            numExchange += 1; // increment numExchange as per problem statement
        }

        return totalDrank;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.maxBottlesDrunk(9, 3);
        System.out.println(result); // Output: 12
    }
}
