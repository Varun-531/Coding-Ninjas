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

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> next = null;
        Node<Integer> prev = null;
        int count = 0;

        // Count the number of nodes in the current group
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Recursively reverse the rest of the list
        if (next != null) {
            head.next = kReverse(next, k);
        }

        return prev; // 'prev' is now the new head of the reversed group
    }
}