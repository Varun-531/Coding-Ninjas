import java.util.*;
public class Solution {
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        Stack<Integer> stack = new Stack<>();
        LinkedListNode<Integer> temp = head;
        while (temp.next != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        if (temp.data + 1 < 10) {
            temp.data = temp.data + 1;
            return head;
        }

        stack.push(temp.data);

        temp = null;

        int carry = 1;
        while (!stack.isEmpty() && carry != 0) {

            int result = stack.pop() + carry;
            LinkedListNode<Integer> newNode = new LinkedListNode<>(result % 10);
            newNode.next = temp;
            temp = newNode;
            carry = result / 10;
        }

        if (carry == 0)
            return temp;

        LinkedListNode<Integer> newNode = new LinkedListNode<>(1);
        newNode.next = temp;
        return newNode;
   
	}


}