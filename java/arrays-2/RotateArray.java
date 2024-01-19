public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length-1;
        reverse(arr,0,n);
        reverse(arr,0,n-d);
        reverse(arr,n-d+1,n);
    }
    public static void reverse(int[] a,int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    } 
}