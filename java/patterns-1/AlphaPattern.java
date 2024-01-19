import java.util.*;
public class AlphaPattern{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		while(i<=a){
			int j=1;
			while(j<=i){
				char tt=(char)('A'+i-1);
				System.out.print(tt);
				j++;
			}System.out.println();
			i++;
		}
	}

}