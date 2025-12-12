class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        for(int i=0;i<n;i++){
           
            int mid=(low + high)/2;
            if(nums[mid]==target){
               return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}