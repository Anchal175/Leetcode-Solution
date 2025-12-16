class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int ans[] = new int[n];
        
        // for (int i = 0; i < n; i++) {
        //     int product = 1; // reset for each i
        //     for (int j = 0; j < n; j++) {
        //         if (i != j) {
        //             product *= nums[j];
        //         }
        //     }
        //     ans[i] = product; // store for this i
        // }
        // return ans;    
        // }}             //thi give tle

//         int n=nums.length;
//         int ans[]=new int[n];
//         int prefix[]=new int[n];
//         int suffix[]=new int[n];
//          prefix[0]=1;
//         for(int i=1;i<n;i++){
//             prefix[i]=prefix[i-1]*nums[i-1];
//         }
//         //STEP 2: find suffix and last se strt krenge 
//          suffix[n-1]=1;
//         for(int i=n-2;i>=0;i--){
//             suffix[i]=suffix[i+1]*nums[i+1];
//         }
//         for(int i=0;i<n;i++){
//             ans[i]=suffix[i]*prefix[i];
//         }


// return ans;
int n=nums.length;
int ans[]=new int[n];
int prefix[]=new int[n];
int suffix[]=new int[n];
 prefix[0]=1;
for(int i=1;i<n;i++){
    prefix[i]=prefix[i-1]*nums[i-1];
    
}
 suffix[n-1]=1;
for(int i=n-2;i>=0;i--){
    suffix[i]=suffix[i+1]*nums[i+1];
}
for(int i=0;i<n;i++){
    ans[i]=prefix[i]*suffix[i];
}

return ans;


    }
}
