import java.util.*;
public class CharacterPattern {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int k=1;
		int i=1;
		while(i<=a){
			int j=1;
			while(j<=i){
				char tt = (char)('A'+k-1);
				System.out.print(tt);
				k++;
				j++;
			}
			System.out.println();
			i++;
			k=i;

		}
	}

}
