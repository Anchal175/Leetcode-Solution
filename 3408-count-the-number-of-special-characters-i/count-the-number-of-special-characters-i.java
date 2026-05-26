class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : word.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for(char ch : set) {
            if(Character.isUpperCase(ch) &&
               set.contains(Character.toLowerCase(ch))) {
                count++;
            }
        }

        return count;
    }
}