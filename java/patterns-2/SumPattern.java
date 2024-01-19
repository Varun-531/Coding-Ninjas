import java.util.Scanner;

public class SumPattern {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		int i=1;
		while(i<=a){
			int sum=0;
			int j=1;
			while(j<=i){
				sum=sum+j;
				System.out.print(j);
				if(i!=j)
					System.out.print("+");
				j++;
			}
			i++;
			System.out.print("="+sum);
			System.out.println();
		}
	}
}
