public class Solution {

    // Wrapper method for isSubsetSum
    static boolean isSubsetPresent(int[] arr, int n, int sum) {
        return isSubsetSum(arr, n, sum);
    }

    // Recursive method to check if there is a subset with the given sum
    private static boolean isSubsetSum(int set[], int n, int sum) {
        // Base Cases
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        // If the last element is greater than the sum, ignore it
        if (set[n - 1] > sum) {
            return isSubsetSum(set, n - 1, sum);
        }

        // Check if the sum can be obtained by either including or excluding the last element
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }

    // Driver code (example usage)
    public static void main(String args[]) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetPresent(set, n, sum)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
