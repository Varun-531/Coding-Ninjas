import java.util.*;
public class OldSquare {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		int k=1;
		while(i<=a){
			int j=1;
			k=2*i-1;
			while(j<=a){
				if(k==2*a+1)
					k=1;
				System.out.print(k);
				k+=2;
				j++;
			}System.out.println();
			i++;
		}
}
}
