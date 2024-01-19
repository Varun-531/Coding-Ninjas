public class Solution {  

    public static void selectionSort(int[] arr, int n) {
    	//Your code goes here
        for(int i=0;i<n-1;i++){
            int min= Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;
                }
            }
            int temp=arr[mindex];
            arr[mindex]=arr[i];
            arr[i]=temp;
        }
    }   

}