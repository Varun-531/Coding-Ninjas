import java.util.Scanner;

public class ReverseNumberPattern {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int i=1;
		while(i<=a){
			int j=1;
			while(j<=i){
				System.out.print(i-j+1);
				j++;
			}
			i++;
			System.out.println();
		}

		
	}

}
