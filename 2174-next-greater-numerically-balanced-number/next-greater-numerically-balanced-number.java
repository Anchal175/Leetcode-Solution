class Solution {
    public int nextBeautifulNumber(int n) {
     int num=n+1;
     while(true){
        if(balanced(num))
        return num;
        num++;
     }
    }
   
    private boolean balanced(int num){
     String s=String.valueOf(num);
     int count []=new int[10];
     for(char c:s.toCharArray()){
        count[c-'0']++;
     }
     for(char c:s.toCharArray()){
        int d= c-'0';
        if(count[d]!=d)
            return false;
        
     }
     
     return true;

    }
}