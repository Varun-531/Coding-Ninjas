import java.util.*;
public class Solution {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        // Write your code here.
        int a[] = new int[n];
        int i=0;
        int carry=0;
        while(i<n){
            int sum =p1[i]+p2[i]+carry;
            if(sum>x){
                a[i]=x;
                carry = sum-x;
            }
            else{
                a[i]=sum;
                carry=0;
            }
            i++;
        }
        return a;
    }
}