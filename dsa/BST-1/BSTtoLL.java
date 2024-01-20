import java.util.*;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	private static Queue<Integer> pp(BinaryTreeNode<Integer> root){
		Queue<Integer> queue = new LinkedList<Integer>();
		if(root==null)
			return queue;
		else{
			queue.addAll(pp(root.left));
			queue.add(root.data);
			queue.addAll(pp(root.right));
		}
		return queue;
	}
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Queue<Integer> queue = pp(root);
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(null);
		LinkedListNode<Integer> ll = head;
		while(queue.size()!=0){
			int a = queue.poll();
			LinkedListNode<Integer> temp = new LinkedListNode<Integer>(a);
			ll.next = temp;
			ll = ll.next;
		}
		return head.next;
	}
}