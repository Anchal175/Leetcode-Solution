class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int temp=x%10;
            x=x/10;
            if(rev > 0 && rev > (Integer.MAX_VALUE - temp) / 10 || rev<0 && rev<(Integer.MIN_VALUE - temp)/10) return 0;
            rev=rev*10+temp;

        }
        return rev;
    }
}