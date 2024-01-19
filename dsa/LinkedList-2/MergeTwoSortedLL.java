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
    
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if(head1==null&&head2==null)
            return null;
        else if(head1==null)
            return head2;
        else if(head2==null)
            return head1;
        Node<Integer> head;
        if(head1.data>=head2.data){
             head = head2;
            head2 = head2.next;
            }
        else{
             head = head1;
            head1= head1.next;
            }
        Node<Integer> tail = head;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                tail.next = head1;
                head1=head1.next;
                tail = tail.next;
                }
            else{
                tail.next = head2;
                head2=head2.next;
                tail=tail.next;
                }
        }
         if(head1==null){
                tail.next = head2;
            }
        if(head2==null){
                tail.next = head1;

            }
            return head;
    }

}