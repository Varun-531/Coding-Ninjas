public class Solution {
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    
    private static void findMax(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        
        if (root.data > max)
            max = root.data;
        
        findMax(root.left);
        findMax(root.right);
    }
    
    private static void findMin(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        
        if (root.data < min)
            min = root.data;
        
        findMin(root.left);
        findMin(root.right);
    }
    
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        findMax(root);
        findMin(root);
        Pair<Integer, Integer> result = new Pair<>(min, max);
        return result;
    }
}
