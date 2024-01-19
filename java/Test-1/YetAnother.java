import java.util.* ;
import java.io.*; 
public class Solution {

	public static void ninjaPuzzle(int n) {
		int i =1;
		while(i<=n){
			int spaces=1;
			while(spaces<i){
				System.out.print(" ");
				spaces++;
			}
			int stars=1;
			while(stars<=n-i+1){
				System.out.print("*");
				stars++;
			}
			System.out.println();
			i++;
		}
	}
}