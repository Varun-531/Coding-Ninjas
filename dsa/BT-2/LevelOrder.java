import java.util.*;

/*
    Following is the structure used to represent the Binary Tree Node

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
*/

public class Solution {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        if (root == null) {
            return;
        } else {
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                BinaryTreeNode<Integer> current = queue.poll();

                if (current == null) {
                    System.out.println();
                    if (!queue.isEmpty()) {
                        queue.add(null);
                    }
                } else {
                    System.out.print(current.data + " ");

                    if (current.left != null) {
                        queue.add(current.left);
                    }

                    if (current.right != null) {
                        queue.add(current.right);
                    }
                }
            }
        }
    }
}
