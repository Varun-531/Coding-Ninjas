import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
		int at2[][] = new int[n][m];
		for(int i =0;i<n;i++){
			for(int j=0;j<m;j++){
				at2[i][j]=mat[j][i];
			}
		}
		return at2;
	}

}
