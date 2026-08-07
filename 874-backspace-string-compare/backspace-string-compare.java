class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
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
        Stack<Character>st1=new Stack<>();
        for(int i=0;i<t.length();i++){
         if(t.charAt(i)=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(t.charAt(i));
            }
        }
        StringBuilder sb1=new StringBuilder();
        while(!st1.isEmpty()){
            sb1.append(st1.pop());
        }
        String ans1=sb1.reverse().toString();
        if(ans.equals(ans1)){
            return true;
        }
        else {
            return false;
        }
        
    }
}