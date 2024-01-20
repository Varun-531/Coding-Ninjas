import java.util.*;

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

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes her
		Queue<BinaryTreeNode<Integer>> qq = new LinkedList<>();
		if(root==null){
			return ;
		}
		qq.add(root);
		while(qq.size()!=0){
			BinaryTreeNode<Integer> temp = qq.poll();
			int ll =-1;
			int rr = -1;
			if(temp.left!=null){
				 ll = temp.left.data;
				qq.add(temp.left);}
			if(temp.right!=null){
				rr = temp.right.data;
				qq.add(temp.right);}
			System.out.println(temp.data+":L:"+ll+",R:"+rr);
		}
	}
	
}