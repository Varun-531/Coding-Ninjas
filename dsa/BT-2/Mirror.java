/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
public class Solution {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        // Base case: if the tree is empty or has no children, nothing to mirror
        if (root == null || (root.left == null && root.right == null))
            return;

        // Swap the left and right subtrees (if they exist)
        if (root.left != null) {
            mirrorBinaryTree(root.left);
        }
        if (root.right != null) {
            mirrorBinaryTree(root.right);
        }

        // Swap the left and right subtrees' references
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
