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

	public static Node<Integer> mergeSort(Node<Integer> head) {
		//Your code goes here
        if(head==null||head.next==null)
            return head;
        Node<Integer> s = head;
        Node<Integer> f = head;
        while(f.next!=null&&f.next.next!=null)
        {
            s = s.next;
            f = f.next.next;
        }
        Node<Integer> head1 = head;
        Node<Integer> head2 = s.next;
        s.next = null;
        Node<Integer> h1 = mergeSort(head1);
        Node<Integer> h2 = mergeSort(head2);
        Node<Integer> t1 = h1;
        Node<Integer> t2 = h2;
        Node<Integer> tail = null;
        if(t1.data>=t2.data)
        {
            head  = t2;
            tail = t2;
            t2 = t2.next;
        }
        else
        {
            head = t1;
            tail = t1;
            t1 = t1.next;
        }
        while(t1!=null&&t2!=null)
        {
            if(t1.data<=t2.data)
            {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }
            else
            {
                tail.next= t2;
                tail = t2;
                t2= t2.next;
            }
        }
        if(t1!=null)
        {
            tail.next = t1;
        }
        else
        {
            tail.next = t2;
        }
        return head;
	}

}