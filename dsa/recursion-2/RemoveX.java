
public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
		return re(input,input.length());
	}
	 private static String re(String input, int x) {
        if (x == 0)
            return "";
        if (input.charAt(0) == 'x')
            return re(input.substring(1), x - 1);
        else
            return input.charAt(0) + re(input.substring(1), x - 1);
    }
}