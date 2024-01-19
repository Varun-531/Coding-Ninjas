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

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null)
			return 0;
		else{
			int a = height(root.left);
			int b = height(root.right);
			if(a>b)
				return 1+a;
			else	
				return 1+b;
		}
	}
}