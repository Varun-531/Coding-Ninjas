package DSA.LinkedList;
/****************************************************************

	Following is the class structure of the Node class:

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> temp = head;
		// Node<Integer> temp1 = head;
		// int count1=0;
		// while(temp1!=null){
		// 	temp1= temp1.next;
		// 	count1++;
		// }
		// if(count1>)
		int count=0;
		while(temp!=null){
			if(temp.data == n){
				return count;
			}
			temp=temp.next;
			count++;
		}
		return -1;
	}
}