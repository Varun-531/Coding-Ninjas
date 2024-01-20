package JAVA.Strings;

public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ss = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch)
				continue;
			else{
				ss=ss+str.charAt(i);
			}
		}
			
			return ss;
	}

}