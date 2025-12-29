/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left, true, 1);   // start by going left
        dfs(root.right, false, 1); // start by going right
        return ans;
    }

    void dfs(TreeNode node, boolean isLeft, int len) {
        if (node == null) return;
        ans = Math.max(ans, len);

        if (isLeft) {
            // went left last time → go right next
            dfs(node.right, false, len + 1);
            // if we go left again, reset count
            dfs(node.left, true, 1);
        } else {
            // went right last time → go left next
            dfs(node.left, true, len + 1);
            // going right again breaks the streak
            dfs(node.right, false, 1);
        }
    }
}