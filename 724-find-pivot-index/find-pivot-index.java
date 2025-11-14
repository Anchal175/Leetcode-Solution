class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
            for(int l=0;l<i;l++){
                left+=nums[l];
            }
            for(int r=i+1;r<nums.length;r++){
                right+=nums[r];
            }
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}