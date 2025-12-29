class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1, k, n, new ArrayList<>());
        return result;
    }

    private void backtrack(int start, int k, int target, List<Integer> temp) {

        // ✅ base condition
        if (temp.size() == k && target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // ❌ invalid case
        if (temp.size() > k || target < 0) return;

        for (int i = start; i <= 9; i++) {
            temp.add(i);                 // choose
            backtrack(i + 1, k, target - i, temp); // explore
            temp.remove(temp.size() - 1); // un-choose
        }
    }
}
