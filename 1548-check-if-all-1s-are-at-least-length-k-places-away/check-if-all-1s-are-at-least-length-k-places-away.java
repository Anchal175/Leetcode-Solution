class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last = -1;  // last time 1 kaha mila

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                if(last != -1 && i - last - 1 < k){
                    return false;   // gap chhota h 
                }
                last = i; // update last position
            }
        }
        return true;
    }
}
