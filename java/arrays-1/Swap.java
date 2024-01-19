
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int n=arr.length;
        for(int i=1;i<n;i+=2){
            int temp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for(int j=0;j<n;j++){
            // System.out.print(arr[j]+" ");
        }
    }
}