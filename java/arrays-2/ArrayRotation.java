import java.util.concurrent.ExecutionException;

public class Solution {
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        int n = a.length;
        int b[] = new int[n];
        if(dir.equals("RIGHT")){
            for(int i=0;i<n;i++){
                try{
                    b[i+x]=a[i];
                }
                catch(Exception e){
                    b[(i+x)%n]=a[i];
                }
            }
        }
        if(dir.equals("LEFT")){
            for(int i=0;i<n;i++){
                try{
                    b[i]=a[i+x];
                }
                catch(Exception e){
                    b[i]=a[(i+x)%n];
                }
            }
        }
        
        return b;
    }
}
