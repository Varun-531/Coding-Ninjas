/*************** 
     * Following is the Node class already written 
            class Node<T> {
                T data;
                Node<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

 public class Solution {
    public static Node<Integer> reverse_I(Node<Integer> head) {
        Node<Integer> prev = null;
        Node<Integer> current = head;
        Node<Integer> next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer

            // Move prev and current one step forward
            prev = current;
            current = next;
        }

        // After the loop, prev will be the new head of the reversed list
        return prev;
    }
}
