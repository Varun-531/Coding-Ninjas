import java.util.*;
public class TermsofAP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		int count=0;
		while(count!=a){
			int sum = 3*i+2;
			if(sum%4!=0){
				System.out.print(sum+" ");
				count++;
				}
			i++;
		}
	}
}

