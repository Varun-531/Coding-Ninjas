import java.util.Scanner;

public class CtoF {


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		for(int i=a;i<=b;i+=c){
			System.out.print(i+" ");
			int f=(i-32)*5/9;
			System.out.println(f);
		}
	}

}
