
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		String str2="";
		str2 = reverseString(str, str2);
		return str.equals(str2);
	}
	public static String reverseString(String str,String str2){
		int j=0;
		for(int i=str.length()-1;i>=0;i--){
			str2 += str.charAt(i);
		}
		return str2;
	}

}