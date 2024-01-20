package JAVA.Operators;
import java.util.Scanner;

public class AllPrime {
	static void prime(int number){
		int count =0;
		for(int j=1;j<number;j++){
			if(number%j==0)
				count++;
		
		}
		if(count==1)
			System.out.println(number);
	}
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=2;i<=a;i++){
			prime(i);
			
		}
		
		
	}
}
