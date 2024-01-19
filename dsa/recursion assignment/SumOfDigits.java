
public class solution {
	static int sum =0;
	public static int sumOfDigits(int input){
		// Write your code here
		if(input==0)
			return sum;
		else{
			sum = sum+input%10;
			return sumOfDigits(input/10);
		}
	}
}
