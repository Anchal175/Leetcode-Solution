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
    public boolean isBalanced(TreeNode root) {
    //     if(root==null) return true;
    // }
    //    void height(TreeNode root){
    //         int l=height(root.left);
    //         int r=height(root.right);
    //         if((l-r)=='1'){
    //             return true;
    //         }
            
    //     }
    //     return false ;

if(root ==null)return true;
int left=balnc(root.left);
int right=balnc(root.right);
if(Math.abs(left-right)>1){
    return false;
}
 return isBalanced(root.left) &&
               isBalanced(root.right);
    }

    public int balnc(TreeNode root){
        if(root==null) return 0;
        int left=balnc(root.left);
        int right=balnc(root.right);

    return 1+Math.max(left,right);
        
    }
}
