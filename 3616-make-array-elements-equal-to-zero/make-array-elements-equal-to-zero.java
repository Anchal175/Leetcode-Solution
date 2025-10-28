class Solution {
    public int countValidSelections(int[] nums) {
       
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // two directions: 1 = right, -1 = left
                for (int d : new int[]{1, -1}) {
                    int[] arr = Arrays.copyOf(nums, n);
                    int curr = i;
                    int dir = d;
                    while (curr >= 0 && curr < n) {
                        if (arr[curr] == 0) {
                            curr += dir;
                        } else {
                            arr[curr]--;
                            dir = -dir;
                            curr += dir;
                        }
                    }
                    boolean allZero = true;
                    for (int x : arr) {
                        if (x != 0) {
                            allZero = false;
                            break;
                        }
                    }
                    if (allZero) count++;
                }
            }
        }
        return count;
    
    }
}