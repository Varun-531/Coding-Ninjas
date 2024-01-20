public class Solution {
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // Check if the left subtree needs to be explored
        if (k1 < root.data) {
            elementsInRangeK1K2(root.left, k1, k2);
        }

        // Check if the current node falls within the range [k1, k2]
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        // Check if the right subtree needs to be explored
        if (k2 > root.data) {
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }
}
