class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);                     // sorting necessary
        back(nums, 0, new ArrayList<>());
        return ans;
    }

    public void back(int[] nums, int start, List<Integer> temp) {

        ans.add(new ArrayList<>(temp));        // add deep copy

        for (int i = start; i < nums.length; i++) {

            // skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            temp.add(nums[i]);                 // pick
            back(nums, i + 1, temp);           // explore
            temp.remove(temp.size() - 1);      // unpick
        }
    }
}