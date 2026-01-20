class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
       int max=0;
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]-nums[i]==1){
                int c=0;
                for(int k=i;k<=j;k++){
                    if(nums[k]==nums[i]||nums[k]==nums[j]){
                        c++;
                    }
                }
                max=Math.max(max,c);
            }
        }
       }

       return max;
    }
}