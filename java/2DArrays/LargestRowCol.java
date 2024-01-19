public class Solution {
    public static void findLargest(int mat[][]) {
        int rows = mat.length;
        int sum = Integer.MIN_VALUE;
        if(rows == 0){
            System.out.println("row "+0+" "+sum);
             return ;
        }
           
        int cols = mat[0].length;
        int rc = -1;
        int count =-1;
        
        for(int i=0;i<rows;i++){
            int sum2 = 0;
            for(int j=0;j<cols;j++){
                sum2 = sum2 +mat[i][j];
                if(sum<sum2){
                    sum = sum2 ;
                    rc = 0;
                    count =i;
                }
            }
        }
        for(int k=0;k<cols;k++){
            int sum3 =0;
            for(int l=0;l<rows;l++){
                sum3 = sum3 + mat[l][k];
                if(sum<sum3){
                    sum = sum3 ;
                    rc = 1;
                    count =k;
                }
            }
        }
        if(rc == 0)
            System.out.print("row ");
        else 
            System.out.print("column ");
        System.out.println(count+" "+sum);
    }
}
