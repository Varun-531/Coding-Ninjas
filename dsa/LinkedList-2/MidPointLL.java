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
    
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head==null)
            return head;
        Node<Integer> temp = head;
        int count=0;
        while(temp.next!=null){
            temp = temp.next;
            count++;}
            int count2=0;
            temp = head;
        while(count2<count/2){
            temp = temp.next;
            count2++;
        }
        return temp;
    }

}