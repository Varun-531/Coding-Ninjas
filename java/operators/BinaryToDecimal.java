import java.util.*;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=a;
		while(b>0){
			int r = b%10;
			sum = sum + r*(int)Math.pow(2, count);
			b=b/10;
			count++;
		}
		System.out.println(sum);
	}
}
