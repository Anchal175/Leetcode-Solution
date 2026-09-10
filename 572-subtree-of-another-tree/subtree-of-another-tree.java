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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(subRoot==null){
         return   true;
        }
         if (isametree(root, subRoot)) {
            return true;
        }

        // Search in left subtree OR right subtree
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

   
    
    public boolean isametree(TreeNode root,TreeNode subRoot){
        if(root== null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.val!=subRoot.val){
            return false;
        }
        return isametree(root.left,subRoot.left)&& isametree(root.right,subRoot.right);
    }
}