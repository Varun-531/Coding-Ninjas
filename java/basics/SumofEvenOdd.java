package JAVA.Basics;
import java.util.*;
public class SumofEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int even =0;
		int odd=0;
		while(a>0){
			int r=a%10;
			if(r%2==0)
				even=even+r;
			else	
				odd=odd+r;
			a=a/10;
		}
		System.out.print(even+" "+odd);
	}
}
