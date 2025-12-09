
class Solution{

    public  boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }
            else if(s.charAt(i)=='{'){
                st.push('}');
            }
            else if(s.charAt(i)=='['){
                st.push(']');
            }
            else if(!st.isEmpty()&&(s.charAt(i)==')' ||s.charAt(i)==']' ||s.charAt(i)=='}')){
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }
                else return false;
            }
            else return false;
        }
        return st.isEmpty();



















    
    }
}