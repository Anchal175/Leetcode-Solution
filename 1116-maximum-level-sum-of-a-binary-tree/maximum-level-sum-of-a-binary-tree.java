class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 1;
        int maxLevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {

            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }

            level++;
        }
        return maxLevel;
    }
}
