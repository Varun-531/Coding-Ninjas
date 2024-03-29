
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = Math.max(arr1.length, arr2.length);
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = arr1[i]+arr2[j]+carry;
            output[k] = sum%10;
            carry = sum/10;

            k--;
            i--;
            j--; 
        }
         while(i>=0 ){
            int sum = arr1[i]+carry;
            output[k] = sum%10;
            carry = sum/10;

            k--;
            i--;
        }
         while(j>=0){
            int sum = arr2[j]+carry;
            output[k] = sum%10;
            carry = sum/10;

            k--;
            j--; 
        }
        output[0]=carry;
    }

}