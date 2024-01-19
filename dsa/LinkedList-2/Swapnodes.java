public class Solution {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if (head == null || i == j) {
            return head;
        }

        int count1 = 0;
        int count2 = 0;
        Node<Integer> temp1 = head;
        Node<Integer> temp2 = head;
        Node<Integer> prev1 = null;
        Node<Integer> prev2 = null;

        while (count1 != i && temp1 != null) {
            prev1 = temp1;
            temp1 = temp1.next;
            count1++;
        }

        while (count2 != j && temp2 != null) {
            prev2 = temp2;
            temp2 = temp2.next;
            count2++;
        }

        if (temp1 == null || temp2 == null) {
            // Either i or j is out of bounds.
            return head;
        }

        // if (prev1 != null) {
            prev1.next = temp2;
        // } else {
        //     head = temp2;
        // }

        // if (prev2 != null) {
            prev2.next = temp1;
        // } else {
        //     head = temp1;
        // }

        Node<Integer> temp = temp1.next;
        temp1.next = temp2.next;
        temp2.next = temp;

        return head;
    }
}
