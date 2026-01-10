class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0)
            return result;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (a[0] + a[1]) - (b[0] + b[1])
        );

        // Step 1: first k pairs push
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }

        // Step 2: extract k smallest
        while (k-- > 0 && !pq.isEmpty()) {
            int[] cur = pq.poll();
            result.add(Arrays.asList(cur[0], cur[1]));

            int j = cur[2];
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{cur[0], nums2[j + 1], j + 1});
            }
        }

        return result;
    }
}
