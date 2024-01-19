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

    public static void printIthNode(Node<Integer> head, int i){
        int count=0;
		Node<Integer> temp = head;
		while(temp!=null){
			if(count==i){
				System.out.println(temp.data);
				return ; }
			else{
				temp = temp.next;
				count++;
			}
		}
    }
}