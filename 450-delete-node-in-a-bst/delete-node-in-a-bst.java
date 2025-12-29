class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // Node found

            // Case 1 & 2
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: two children
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    // inorder successor
    private TreeNode findMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
