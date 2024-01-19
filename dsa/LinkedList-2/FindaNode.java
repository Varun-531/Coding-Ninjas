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

    static int c =0;
    
        public static int findNodeRec(Node<Integer> head, int n) {
            //Your code goes here
            if(head==null)
                return -1;
            if(head.data==n)
                return c;
            else{
                c++;
                return findNodeRec(head.next, n);}
        }
    
    }