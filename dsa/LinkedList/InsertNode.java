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

    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        Node<Integer> temp = head;
        Node<Integer> newNode = new Node<Integer>(data);
        
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        int count = 0;
        while(temp != null){
            if(count == pos - 1){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
            count++;
        }
        
        return head;
    }
}
