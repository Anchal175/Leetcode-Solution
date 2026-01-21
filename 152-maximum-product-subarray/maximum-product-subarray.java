class Solution {
    public int maxProduct(int[] nums) {
//         int maxx=Integer.MIN_VALUE;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int product=1;
//                 for(int k=i;k<=j;k++){
//                     product*=nums[k];
//                     maxx=Math.max(product,maxx);

//                 }
//             }
//         }
// return maxx;

int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
      int p=1;
    for(int j=i;j<nums.length;j++){
      
        
            p*=nums[j];
            max=Math.max(max,p);

        
    }
}
return max;
    }
}