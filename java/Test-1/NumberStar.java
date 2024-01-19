import java.util.*;
public class NumberStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		while(i<=a){
			int j=a;
			while(j>=1){
				if(j==i){
					System.out.print("*");
				}
				else{System.out.print(j);}
				
				j--;
			}
			i++;
			System.out.println();
		}
	}
}
