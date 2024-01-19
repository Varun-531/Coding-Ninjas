public class Solution {  

    public static int secondLargestElement(int[] arr, int n) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int mindex=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>max1){
                max1=arr[i];
                mindex=i;
               
            }

        }
         arr[mindex]=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
           if(arr[i]>max2){
               max2=arr[i];
           }
        }
        
        return max2;
    }
}