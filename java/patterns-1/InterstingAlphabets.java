import java.util.*;
public class InterstingAlphabets {
	public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		while(i<=a){
			int j=1;
			while(j<=i){
				char tt = (char)('A'+a-i+j-1);
				System.out.print(tt);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}