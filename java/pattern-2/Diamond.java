import java.util.*;

public class Diamond {
    
   public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = (a+1)/2;
        int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			int k=1;
			while(k<i){
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();
		}
		int l = (a-1)/2;
		int c = 1;
		while(c<=l){
			int spaces1=1;
			while(spaces1<=c){
				System.out.print(" ");
				spaces1++;
			}
			int stars=1;
			while(stars<=(l-c)*2+1){
				System.out.print("*");
				stars++;
			}
			
			c++;
			System.out.println();
		}
		
    }
}
