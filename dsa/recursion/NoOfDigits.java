package DSA.Recursion;
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        if(n==0)
            return 0;
        else{
            int small = countDigits(n/10);
            int output = 1 + small;
            return output; 
        }
    }
}
