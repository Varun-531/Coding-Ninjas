package DSA.LinkedList;
/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		Node<Integer> temp = head;
		Node<Integer> tail = head;
		Node<Integer> prev = head;
		int length = 0;
		while(tail!=null){
			prev = tail;
			tail=tail.next;
			length++;
		}
		// System.out.println(length);
		int count1=1;
		while(temp!=null){
			if(count1==length-n){
				prev.next=head;
				head=temp.next;
				temp.next = null;
				return head;
			}
			temp = temp.next;
			count1++;
		}
		return head;
	}
}