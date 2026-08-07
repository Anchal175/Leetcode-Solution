class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(int  i=0;i<s.length();i++){
            
            if(Character.isDigit(s.charAt(i))){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            }
            String ans=sb.reverse().toString();
            return ans;
        
    }
}