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
	private static int height(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int lr = height(root.left);
		int hr = height(root.right);
		if(lr>hr)
			return lr+1;
		else 
			return hr+1;
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root==null)
			return 0;
		int a = height(root.left)+height(root.right)+1;
		int b = diameterOfBinaryTree(root.left);
		int c = diameterOfBinaryTree(root.right);
		return Math.max(a,Math.max(b,c));
	}
	
}