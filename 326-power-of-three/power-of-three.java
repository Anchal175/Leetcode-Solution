// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if (n==0){return false;}
//         if(n%3==0){
//             n/=3;
//             return true;
//         }
//         return false;

//     }

// }
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
}