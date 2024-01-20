public class Solution {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        // Check if the tree is empty
        if (root == null) {
            return -1; // Or any appropriate value to indicate that the nodes were not found.
        }

        // Check if either of the two nodes is the root
        if (root.data == a || root.data == b) {
            return root.data;
        }

        // Recursively search for the nodes in the left and right subtrees
        int leftResult = getLCA(root.left, a, b);
        int rightResult = getLCA(root.right, a, b);

        // If both nodes are found in the left and right subtrees, then the current root is the LCA
        if (leftResult != -1 && rightResult != -1) {
            return root.data;
        }

        // If either of the nodes is found, return that node as the result
        if (leftResult != -1) {
            return leftResult;
        }

        if (rightResult != -1) {
            return rightResult;
        }

        // If neither node is found, return -1 or any appropriate value.
        return -1;
    }
}