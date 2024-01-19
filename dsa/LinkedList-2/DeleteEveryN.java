public class Solution {
    
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if (head == null||M==0)
            return null;

        Node<Integer> temp1 = head;
        int count1 = 1;
        while (count1 < M && temp1 != null) {
            temp1 = temp1.next;
            count1++;
        }

        if (temp1 == null)
            return head;

        Node<Integer> temp2 = temp1.next;
        int count2 = 1;
        while (count2 <= N && temp2 != null) {
            temp2 = temp2.next;
            count2++;
        }
        temp1.next = skipMdeleteN(temp2, M, N);

        return head;
    }
}
