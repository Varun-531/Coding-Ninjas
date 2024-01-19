public class Solution {
    public static int[] printColWise(int [][]a) {
        // Write your code here.
         int n = a.length;
        int m = a[0].length;
        int arr[] = new int[m*n]; 
        int c =0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[c] = a[j][i];
                c++;
            }
        }
        return arr;
    }
}