import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		if(root==null)
			return null;
		if(root.data==data){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(root.data);
			return arr;
		}
		ArrayList<Integer> arr1 = getPath(root.left, data);
		if(arr1!=null){
			arr1.add(root.data);
			return arr1;}
		ArrayList<Integer> arr2 = getPath(root.right, data);
		if(arr2!=null){
			arr2.add(root.data);
			return arr2;
			}
			return null;
	}
}