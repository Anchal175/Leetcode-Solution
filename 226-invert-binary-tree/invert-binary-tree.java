class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursive calls
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
