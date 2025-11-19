class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int countOnes = 0;
        
        for (int i = bits.length - 2; i >= 0 && bits[i] == 1; i--) {
            countOnes++;
        }
        
        return countOnes % 2 == 0;
    }
}