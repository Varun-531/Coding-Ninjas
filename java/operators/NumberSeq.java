import java.util.*;
public class NumberSeq {
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		
		}
		int[] a1=new int[n-1];
		for(int i=0;i<n-1;i++){
			if(a[i]==a[i+1]){
				System.out.println("false");
				return;
			}
			a1[i] = a[i]-a[i+1];
		}
		for(int i=0;i<n-2;i++){
			if(a1[i]<0 && a1[i+1]>0){
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
}
