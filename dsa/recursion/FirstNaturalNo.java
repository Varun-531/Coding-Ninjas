package DSA.Recursion;
public class Solution {
    public static void print(int n) {
		int x =1;
        if(n==0)
			return ;
		else{
			print(n-1);
			System.out.print(n+" ");
		}
    }
}
