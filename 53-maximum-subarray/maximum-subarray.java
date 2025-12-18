class Solution {
    public int maxSubArray(int[] nums) {


  int currentSum = 0, maxSum = Integer.MIN_VALUE;
  for (int num : nums) {
   currentSum += num;
   maxSum = Math.max(maxSum, currentSum);
   if (currentSum < 0) currentSum = 0;
  }
  return maxSum;
 }
} 
       
       
        