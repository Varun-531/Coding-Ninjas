public class solution {


	public static String get(int n){
		String str="";
		if (n % 10 == 2) {
			str = "abc";
		} else if (n % 10 == 3) {
			str = "def";
		} else if (n % 10 == 4) {
			str = "ghi";
		} else if (n % 10 == 5) {
			str = "jkl";
		} else if (n % 10 == 6) {
			str = "mno";
		} else if (n % 10 == 7) {
			str = "pqrs";
		} else if (n % 10 == 8) {
			str = "tuv";
		} else if (n % 10 == 9) {
			str = "wxyz";
		}
		return str;
	}
	public static  void printKeypad(int input,String str){
		if(input==0){
			System.out.println(str);
			return;
		}
		String str1 = get(input%10);

		for (int i = 0; i < str1.length(); i++) {
			printKeypad(input/10, str1.charAt(i) + str);
		}

	}
	public static void printKeypad(int input){
		// Write your code here
		printKeypad(input,"");
	}
}
