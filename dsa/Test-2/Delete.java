/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        if(head.next!=null){
        Node<Integer> temp = head;
        Node<Integer> prev = head;
        while(temp!=null){
            temp=temp.next;
            temp=temp.next;
            prev.next = temp;
            prev = prev.next;
        }}
        
        //Your code goes here
    }
}