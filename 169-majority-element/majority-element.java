class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return nums[n/2];


        // int  count=0;
        // int element=0;
        // for(int i=0;i<nums.length;i++){
        //     if(count==0){
        //         element=nums[i];
        //     }
        //     if(element==nums[i]){
        //         count++;
        //     }
        //     else{
        //         count--;
        //     }
        // }


        // //STEP TO VERIFY THE ELEMENT
        //      count = 0;
        // for (int num : nums) {
        //     if (num == element) {
        //         count++;
        //     }
        // }

        // if (count > nums.length / 2) {
        //     return element; // valid majority
        // }
        // return -1;
        int max=0;
       // int c=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(max<c){
                max=c;
                ans=nums[i];
            }
        }
        return ans;
        
    }
}