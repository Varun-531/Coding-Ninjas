import java.util.*;
public class InvertedPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int i=1;
		while(i<=a){
			int j=1;
			while(j<=a-i+1){
				System.out.print(a-i+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
