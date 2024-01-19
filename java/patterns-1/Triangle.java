import java.util.*;
public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;
		while(i<=a){
			int j=1;
			while(j<=i){
				System.out.print("*");
				j=j+1;
			}System.out.println();
			i=i+1;
		}
		}
	}


