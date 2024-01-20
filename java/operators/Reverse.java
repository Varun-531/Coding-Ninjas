package JAVA.Operators;
import java.util.*;
public class Reverse{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int sum=0;
		while(b>0){
			int r = b%10;
			sum=sum*10+r;
			b=b/10;
		} 
		System.out.print(sum);

	}
}
