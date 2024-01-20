import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        ArrayList<LinkedListNode<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedListNode<Integer> head = null;
            LinkedListNode<Integer> prev = null;
            
            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> current = queue.poll();
                LinkedListNode<Integer> newNode = new LinkedListNode<>(current.data);
                
                if (head == null) {
                    head = newNode;
                } else {
                    prev.next = newNode;
                }
                
                prev = newNode;
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            
            result.add(head);
        }
        
        return result;
    }
}