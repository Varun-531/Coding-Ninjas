import java.util.function.BiConsumer;

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
	private static void pp(BinaryTreeNode<Integer> root, int k, String str){
		str=str+k+" ";
		if(root.left==null&&root.right==null){
			if(root.data==k){
				System.out.print(str);
				return ;
			}
		}
		
			pp(root.left,k-root.data,str);
		
		
		pp(root.right,k-root.data,str);
		
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		if(root==null)
			return ;
		String str = "";
		pp(root,k,str);
	}

}