import java.util.*;
import java.util.Scanner;
public class HalfDiamond {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		System.out.println("*");
		while(i<=a){
			int num=1;
			System.out.print("*");
			while(num<=i){
				System.out.print(num);
				num++;
			}
			num=num-1;
			while(num>1){
				num--;
				System.out.print(num);
				}
			System.out.print("*");
			i++;
			System.out.println();
		}
		int j=1;
		while(j<=a-1){
			int num=1;
			System.out.print("*");
			while(num<=a-j){
				System.out.print(num);
				num++;
			}
			num=num-1;
			while(num>1){
				num--;
				System.out.print(num);
				}
			j++;
			System.out.print("*");
			System.out.println();
		}
        System.out.print("*");
	}
}