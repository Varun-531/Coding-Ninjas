public class Solution {
    
    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    // Helper function for the reverse in-order traversal
    private static int replaceAndSum(BinaryTreeNode<Integer> root, int sum) {
        if (root == null) {
            return sum;
        }

        // Recursively traverse the tree in reverse in-order (right-root-left).
        sum = replaceAndSum(root.right, sum);
        int originalData = root.data;
        root.data += sum;
        sum = replaceAndSum(root.left, root.data);

        return sum;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Start the process with an initial sum of 0.
        replaceAndSum(root, 0);
    }
}