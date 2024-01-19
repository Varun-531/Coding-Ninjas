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


    public static Node<Integer> removeDuplicates(Node<Integer> head) {
if (head == null) {
    return null; 
}

Node<Integer> current = head;

while (current.next != null) {
    if (current.data.equals(current.next.data)) {
        current.next = current.next.next; 
    } else {
        current = current.next; 
    }
}

return head;

}
}