public class Solution {

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;

        changeToDepthTree(root, 0);
    }

    private static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth) {
        if (root == null)
            return;

        // First, process the left subtree
        changeToDepthTree(root.left, depth + 1);

        // Replace the data of the current node with its depth
        root.data = depth;

        // Then, process the right subtree
        changeToDepthTree(root.right, depth + 1);
    }
}
