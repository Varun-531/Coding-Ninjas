
public class Solution {
    
    public static void arrange(int[] arr, int n) {
       int num1=1;
       if(n==0)
         return ;
         else{
             for(int i=0;i<=(n-1)/2;i++){
           arr[i]=num1;
           num1=num1+2;
       }
       int num2=0;
       if(n%2==0)
        num2=n;
        else
            num2=n-1;
       for(int j=(n+1)/2;j<n;j++){
           arr[j]=num2;
           num2=num2-2;
       }}
       
    }
}