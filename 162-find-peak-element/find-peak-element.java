class Solution {
    public int findPeakElement(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if((i==0 || nums[i-1]<nums[i]) && (i==(nums.length-1))||nums[i]>nums[i+1]){
        //         return i;   //arr[i-1]<arr[i]>arr[i+1] se check krenege 
        //     }
        // }
        // return -1;


        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }                   // through binary search
            else{
                high=mid;
            }
        }
        return low;
      
    }
}