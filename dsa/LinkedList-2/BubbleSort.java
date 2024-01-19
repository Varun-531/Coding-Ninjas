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

    public static Node<Integer> bubbleSort(Node<Integer> head) {
           if (head == null || head.next == null)
               return head;
           int length=0;
           Node<Integer> temp = head;
           while(temp!=null)
           {
               length++;
               temp = temp.next;
           }
           for (int i = 0; i < length - 1; i++) {
               Node<Integer> current = head;
               Node<Integer> prev = null;
               while (current != null && current.next != null) {
                   Node<Integer> nextNode = current.next;
                   if (current.data > nextNode.data) {
                       if (prev == null) {
                           current.next = nextNode.next;
                           nextNode.next = current;
                           head = nextNode;
                           prev = nextNode;
                       } else {
                           prev.next = nextNode;
                           current.next = nextNode.next;
                           nextNode.next = current;
                           prev = nextNode;
                       }
                   } else {
                       prev = current;
                       current = current.next;
                   }
               }
           }
   
           return head;
       }
   }