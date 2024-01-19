import java.util.Scanner;

public class Solution {
    public static int[] printRowWise(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int arr[] = new int[m*n]; 
        int c =0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[c] = a[i][j];
                c++;
            }
        }
        return arr;
    }
}
