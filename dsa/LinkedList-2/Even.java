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

	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		//Your code goes here
        if(head==null)
            return head;
        Node<Integer> Even = null;
        Node<Integer> Odd = null;
        Node<Integer> Eventail = null;
        Node<Integer> Oddtail = null;
        while(head!=null){
            if(head.data%2==0){
                if(Even==null){
                    Even = head;
                    Eventail = head;
                }
                else{
                    Eventail.next = head;
                    Eventail = Eventail.next;
                }
            }
            else{
                if(Odd==null){
                    Odd = head;
                    Oddtail = head;
                }
                else{
                    Oddtail.next = head;
                    Oddtail = Oddtail.next;
                }
            }
            head = head.next;
        }
        if(Even==null)
            return Odd;
        if(Odd ==null)
            return Even;
        Eventail.next = null;
        Oddtail.next = Even;
        return Odd;
	}
}