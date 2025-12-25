class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);                 // sort characters
            String key = new String(c);     // sorted string as key

            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
