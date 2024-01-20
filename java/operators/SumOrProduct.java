package JAVA.Operators;
import java.util.*;
public class SumOrProduct {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b==1){
			System.out.println(a*(a+1)/2);
		} 
		else if(b==2){
			int sum=1;
			while(a>0){
				sum=sum*a;
				a--;
			}
			System.out.println(sum);
		}
		else{
			System.out.println(-1);
		}
	}
}
