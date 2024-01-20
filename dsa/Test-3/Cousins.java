import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        if (root == null) {
            return false;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        boolean foundP = false;
        boolean foundQ = false;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> current = queue.poll();

                if (current.data == p) {
                    foundP = true;
                }

                if (current.data == q) {
                    foundQ = true;
                }

                // Check if p or q are children of the current node
                if (current.left != null && current.right != null) {
                    // If p and q are siblings, they cannot be cousins
                    if ((current.left.data == p && current.right.data == q) || (current.left.data == q && current.right.data == p)) {
                        return false;
                    }
                }

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // If both p and q are found in the same level but have different parents, they are cousins
            if (foundP && foundQ) {
                return true;
            }

            // If one of them is found and the other is not, they cannot be cousins
            if ((foundP && !foundQ) || (!foundP && foundQ)) {
                return false;
            }
        }

        // If p or q is not found in the tree, they cannot be cousins
        return false;
    }
}
