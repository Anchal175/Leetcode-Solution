
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
    int solve(TreeNode root,int maxi,int c){
        if(root==null) return 0;
        if(root.val>=maxi){
            return solve(root.left,root.val,c) + solve(root.right,root.val,c) + 1;
        }
        return solve(root.left,maxi,c) + solve(root.right,maxi,c);

    }
    public int goodNodes(TreeNode root) {
        if(root.left==null && root.right==null) return 1;
        return solve(root,root.val,1);
    }
}