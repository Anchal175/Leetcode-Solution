class Solution {
    public int climbStairs(int n) {
        // if(n<=2){
        // return n;
        // }
        //  return (climbStairs(n-1)+climbStairs(n-2)); its give tle
if(n<=2){
    return n;
}
    int ans=0;
    int prev1=1;
    int prev2=2;
    for(int i=3;i<=n;i++){
        ans=prev1+prev2;
        prev1=prev2;
        prev2=ans;
    }
    return ans;
    }
   
}