package JAVA.Strings;
public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
		String ans = "";
		int start =0;
		int end =0;
		int c=0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				c=i;
				end=i;
				ans = input.substring(start,end)+" " +ans;
				start=i+1;
			}
			
		}
		ans = input.substring(c+1,input.length())+" "+ans;
		return ans;
	}
}
