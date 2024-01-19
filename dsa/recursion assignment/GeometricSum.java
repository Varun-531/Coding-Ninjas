
public class solution {
	static double sum =0;
	public static double findGeometricSum(int k){
		 
		// Write your code here
		if(k<0)
			return sum;
		else{
			sum = sum + (1/(Math.pow(2, k)));
			return findGeometricSum(k-1);
		}
	}
}
