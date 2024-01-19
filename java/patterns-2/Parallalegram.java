import java.util.*;
public class Parallalegram {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			int spaces=1;
			while(spaces<i ){
				System.out.print(" ");
				spaces++;
			}
			while(j<=n){
				System.out.print("*");
				j++;
			}System.out.println();
			i++;
		}
	}
}
