
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int arr2[] = new int[arr.length];
        int m = d;
        int i=0;
        while(m<arr.length){
            // System.out.print(arr[m]+" ");
            arr2[i]=arr[m];
            i++;
            m++;
        }
        int n =0;
        while(n<d){
            // System.out.print(arr[n]+" ");
            arr2[i]=arr[n];
            i++;
            n++;
        }
        for(int j =0;j<arr.length;j++){
            arr[j]=arr2[j];
        }
    }

}