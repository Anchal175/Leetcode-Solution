class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String goals=s+s;
        return goals.contains(goal);
    }
}