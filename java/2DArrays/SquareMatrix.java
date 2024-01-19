import java.util.*;
public class Solution {
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) {
        // Write your code here.
        if(m!=n){
            return "NO";
        }
        else{
            System.out.println("YES");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==j)
                        System.out.print(mat[i][i]+" ");
                }
            }
        }
        return "";
    }
}