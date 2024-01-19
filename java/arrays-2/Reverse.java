public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
}