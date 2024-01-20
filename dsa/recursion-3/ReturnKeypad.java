public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
		if (n == 0) {
			String out[] = new String[1];
			out[0] = "";
			return out;
		}
		String str="";
		if(n%10==2){
			str="abc";
		}else if (n % 10 == 3) {
			str = "def";
		}else if (n % 10 == 4) {
			str = "ghi";
		}else if (n % 10 == 5) {
			str = "jkl";
		}else if (n % 10 == 6) {
			str = "mno";
		}else if (n % 10 == 7) {
			str = "pqrs";
		}else if (n % 10 == 8) {
			str = "tuv";
		}else if (n % 10 == 9) {
			str = "wxyz";
		}

		String Out[] = keypad(n/10);
		String newOut[] = new String[Out.length*str.length()];
		int k=0;
		for(int i=0;i<Out.length;i++){
			for(int j=0;j<str.length();j++){
				newOut[k]=Out[i]+str.charAt(j);
				k++;
			}
		}
		return newOut;
	}
	
}