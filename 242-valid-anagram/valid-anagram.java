class Solution {
    public boolean isAnagram(String s, String t) {
 if(s.length()!=t.length()) return false;
  char[] A=s.toCharArray();
  char []B=t.toCharArray();
  Arrays.sort(A);
  Arrays.sort(B);
  return Arrays.equals(A,B);}}