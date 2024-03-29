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

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root==null)
			return 0;
		else{
			int a=countNodesGreaterThanX(root.left, x);
			int b=countNodesGreaterThanX(root.right, x);
			if(root.data>x)
				return 1+a+b;
			else
				return a+b;
		}
	}

}