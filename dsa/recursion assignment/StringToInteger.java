
public class solution {
	static int sum=0;
	public static int convertStringToInt(String input){
		// Write your code here
		if(input.length()==0)
			return sum;
		else{
			sum = sum*10 + (int)input.charAt(0)-48;
			return convertStringToInt(input.substring(1));
		}
	}
}
