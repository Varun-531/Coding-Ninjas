package DSA.LinkedList;
/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		int count = 0;
		int count2=0;
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;
		while(temp1!=null){
			temp1=temp1.next;
			count2++;
		}
		if(count2<=pos){
			return head;
		}
		if(pos ==0){
			temp = head.next;
			head.next= null;
			head = temp;
		}
		while(temp!=null){
			if(count==pos-1){
				temp.next = temp.next.next;

				break;
			}

		
			temp=temp.next;
			count++;

		}
			
		return head;

	}
}