public class Solution {

    // Initialize a class-level variable to keep track of the previously visited node.
    private static BinaryTreeNode<Integer> prev = null;

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isBSTUtil(root);
    }

    private static boolean isBSTUtil(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return true;
        }

        // Recursively check the left subtree
        if (!isBSTUtil(node.left)) {
            return false;
        }

        // Check if the current node's value is greater than the previously visited node's value.
        if (prev != null && node.data <= prev.data) {
            return false;
        }

        // Update the previous node to the current node.
        prev = node;

        // Recursively check the right subtree
        return isBSTUtil(node.right);
    }
}
