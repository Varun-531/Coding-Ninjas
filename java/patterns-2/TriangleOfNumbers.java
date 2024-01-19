import java.util.*;
public class TriangleOfNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		int k;
		while(i<=a){
			int spaces=1;
			while(spaces<=a-i){
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			k=i;
			while(j<=i){
				System.out.print(k);
				j++;
				k++;
			}
			int f=1;
			k=k-2;
			while(f<i){
				System.out.print(k);
				f++;
				k--;
			}
			System.out.println();
		i++;
		}
		}}
