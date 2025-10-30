class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If concatenating in both orders gives different result, no gcd string exists
        if (!(str1 + str2).equals(str2 + str1)) return "";
        
        // Find gcd of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return substring of that gcd length
        return str1.substring(0, gcdLength);
    }

    // Euclidean algorithm for gcd
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
