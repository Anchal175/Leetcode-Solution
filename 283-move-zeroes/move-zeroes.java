// class Solution {
//     public void moveZeroes(int[] nums) {
//   for(int i=0;i<nums.length-1;i++){
//     for(int j=0;j<nums.length-1-i;j++){
//         if(nums[j]==0&& nums[j+1]!=0){
//             int temp=nums[j];
//             nums[j]=nums[j+1];
//             nums[j+1]=temp;
//         }
//     }
//   }
       
//     }
// }
 class Solution {
     public void moveZeroes(int[] nums) {
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = 0; j < nums.length - 1 - i; j++) {
//                 if (nums[j] == 0 && nums[j + 1] != 0) { // j use kiya
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//     }
// }
for(int j=0;j<nums.length-1;j++){
for(int i=0;i<nums.length-j-1;i++){
    if(nums[i]==0 && nums[i+1]!=0){
        int temp=nums[i];
        nums[i]=nums[i+1];
        nums[i+1]=temp;
    }
}
     }
     }
 }















