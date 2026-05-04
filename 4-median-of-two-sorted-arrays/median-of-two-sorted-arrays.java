import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length + nums2.length];
        int idx = 0;

        // nums1 ka data copy
        for (int num : nums1) {
            merged[idx++] = num;
        }

        // nums2 ka data copy
        for (int num : nums2) {
            merged[idx++] = num;
        }

        // sort karna
        Arrays.sort(merged);

        int n = merged.length;
        if (n % 2 == 1) {
            // odd → middle element return
            return merged[n / 2];
        } else {
            // even → average of two middle elements
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }
}
