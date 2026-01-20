class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[code.length];
     
       int n=code.length;
       if(k==0){
        return arr;
       }
       for(int i=0;i<n;i++){
   int sum=0;
       
       if(k>0){
        for(int j=1;j<=k;j++){
            sum+=code[(i+j)%n];
        }
       }
       else{
        for(int j=1;j<=-k;j++){
            sum+=code[(i-j+n)%n];
        }
       }

       arr[i]=sum;
       }
       return arr;
    }
}