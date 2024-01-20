import java.util.Stack;

public class Solution {
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int S) {
        if (root == null) {
            return;
        }

        Stack<BinaryTreeNode<Integer>> leftStack = new Stack<>();
        Stack<BinaryTreeNode<Integer>> rightStack = new Stack<>();

        // Initialize left and right pointers
        BinaryTreeNode<Integer> left = root;
        BinaryTreeNode<Integer> right = root;

        // Initialize loops for the left and right subtrees
        while (true) {
            // Traverse the left subtree
            while (left != null) {
                leftStack.push(left);
                left = left.left;
            }

            // Traverse the right subtree
            while (right != null) {
                rightStack.push(right);
                right = right.right;
            }

            // Check for termination
            if (leftStack.isEmpty() || rightStack.isEmpty()) {
                break;
            }

            BinaryTreeNode<Integer> leftNode = leftStack.peek();
            BinaryTreeNode<Integer> rightNode = rightStack.peek();

            if (leftNode.data >= rightNode.data) {
                break; // Nodes overlap or there is no more possibility
            }

            int currentSum = leftNode.data + rightNode.data;

            if (currentSum == S) {
                System.out.println(leftNode.data + " " + rightNode.data);
                leftStack.pop();
                rightStack.pop();
                left = leftNode.right;
                right = rightNode.left;
            } else if (currentSum < S) {
                leftStack.pop();
                left = leftNode.right;
            } else {
                rightStack.pop();
                right = rightNode.left;
            }
        }
    }
}