public class Solution {
    public static void print2DArray(int input[][]) {
        int m = input.length;
        int n = input[0].length;
        int st = m;
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < st; k++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
            }
            st--;
        }
    }
}
