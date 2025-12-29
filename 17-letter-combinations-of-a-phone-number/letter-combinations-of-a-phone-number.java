class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return result;

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), map);
        return result;
    }

    private void backtrack(String digits, int index,
                           StringBuilder temp, String[] map) {

        // ✅ base case
        if (index == digits.length()) {
            result.add(temp.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            temp.append(ch);               // choose
            backtrack(digits, index + 1, temp, map); // explore
            temp.deleteCharAt(temp.length() - 1);    // un-choose
        }
    }
}
