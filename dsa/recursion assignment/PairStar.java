
public class solution {
	static String sum="";
	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		if(s.length()==1)
			return sum+s.charAt(0);
		else if(s.charAt(0)==s.charAt(1))
			sum=sum+s.charAt(0)+"*";
		else
			sum=sum+s.charAt(0);
		return addStars(s.substring(1));
	}
}
