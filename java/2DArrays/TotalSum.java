
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		int sum =0;
		int m = mat.length;
		if(m==0){
		System.out.println(0);
			return ;}
		for(int i =0;i<m;i++){
			for(int j =0;j<m;j++){
				if(i==0||j==0||i==m-1||j==m-1)
					sum = sum + mat[i][j];
				else if(i==j && j!=0&&j!=m-1)
					sum = sum + mat[i][j];
				else if(j==m-1-i&&j!=0&&j!=m-1)
					sum = sum + mat[i][j];
			}
		}
		System.out.println(sum);
	}

}