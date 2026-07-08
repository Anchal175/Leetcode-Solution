class Solution {
    public long sumAndMultiply(int n) {
       int x=0;
       int sum=0;
       int ans =0;
      while(n>0){
        int rem=n%10;
        if(rem!=0){
        x=x*10+rem;
        sum+=rem;
       }
       n/=10;
      }
       while(x>0){
        int r=x%10;
        ans=ans*10+r;
        x/=10;
       }
return (long)sum*ans;

    }
}