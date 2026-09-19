class Solution {
    public int missingNumber(int[] nums) {
//         int xor=0;
//         for(int i=0;i<=nums.length;i++){
//             xor=xor^i;
//         }
//          int xor2=0;
//         for(int i=0;i<nums.length;i++){
//             xor2=xor2^nums[i];
//         }
//         int m=xor^xor2;
//         return m;
//         // int m=nums.length;
//         // for(int i=0;i<nums.length;i++){
//         //     m=m^nums[i]^i;
//         // }
//         // return m;
//     }
// }
int n=nums.length;
int t=n*(n+1)/2;
int sum=0;
for(int i=0;i<n;i++){
    sum+=nums[i];
}
return t-sum;
}}