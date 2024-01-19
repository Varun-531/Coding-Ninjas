
public class Solution {

	public static void rowWiseSum(int[][] a) {
		//Your code goes here
		 int m = a.length;
		 if(m==0)
		 	return ;
        int n = a[0].length;
        // int arr[] = new int[m*n]; 
       	
        for(int i =0;i<m;i++){
			 int c =0;
            for(int j=0;j<n;j++){
                c = a[i][j]+c;
            }
			System.out.print(c+" ");
        }
			System.out.println();
	}
}