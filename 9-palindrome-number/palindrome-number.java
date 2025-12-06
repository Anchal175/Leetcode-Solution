class Solution {
    public boolean isPalindrome(int x) {
           int s=0;
        int target=x;
        while(x>0){
            int r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        return s== target;
    }
}
    