class Solution {
    public String reverseWords(String s) {
        String st[]=s.trim().split(" ");
        String ans=" ";
        for(int i=st.length-1;i>=0;i--){
            if(st[i].length()!=0){
            ans+=st[i]+" ";
        }
        }
        ans=ans.trim(); 
        return ans;
    }
}