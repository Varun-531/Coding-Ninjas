
public class solution {
	static int sum=0;
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n==0)
			return sum;
		else{
			sum += m;
			return multiplyTwoIntegers(m, n-1);
		}
	}
}
