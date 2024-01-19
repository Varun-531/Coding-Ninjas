import java.util.*;
public class StarPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces <=n-i){
				spaces++;
				System.out.print(" ");
			}
			int stars=1;
			while(stars<=i){
				System.out.print("*");
				stars++;
			}
			int dec=i-1;
			while(dec>=1){
				System.out.print("*");
				dec--;
			}
			System.out.println();
		i++;
	}

}}
