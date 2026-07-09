class Solution {
    public int[] nextGreaterElements(int[] nums) {

        // int n = nums.length;
        // int[] ans = new int[n];

        // for (int i = 0; i < n; i++) {
        //     ans[i] = -1; // default

        //     for (int j = 1; j < n; j++) {
        //         int idx = (i + j) % n; // circular index

        //         if (nums[idx] > nums[i]) {
        //             ans[i] = nums[idx];
        //             break;
        //         }
        //     }
        // }
        // return ans;

int ans []=new int[nums.length];
for(int i=0;i<nums.length;i++){
    ans[i]=-1;
    for(int j=1;j<nums.length;j++){
        int k=(i+j)% nums.length;
        if(nums[k]>nums[i]){
            ans[i]=nums[k];
            break;
        }
       
    }
}


return ans;

    }
}
