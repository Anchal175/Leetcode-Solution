class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // for(int i=nums.length-1;i>=0;i--){
        //     if(i==k){
        //         return i;
        //     }
        // }
        // return nums;
        Arrays.sort(nums);
        return nums[nums.length-k];
     
    }
}