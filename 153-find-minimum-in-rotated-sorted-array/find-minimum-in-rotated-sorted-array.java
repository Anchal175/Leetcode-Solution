class Solution {
    public int findMin(int[] nums) {
    //   for(int i=0;i<nums.length-1;i++){
    //     for(int j=0;j<nums.length-1-i;j++){
    //         if(nums[j]>nums[j+1]){
    //             int temp=nums[j];
    //             nums[j]=nums[j+1];
    //             nums[j+1]=temp;  /// its normally i doint sorting 

    //         }
    //     }
    //   }
    //   return nums[0];
   


   int low=0;
   int high=nums.length-1;
   while(low<high){
  int mid=low+(high-low)/2;
  if(nums[mid]>nums[high]){
    low=mid+1;
  }
  else{
    high=mid;
  }
  
    }
    return nums[low];

}
}