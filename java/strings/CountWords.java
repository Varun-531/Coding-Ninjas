package JAVA.Strings;

public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				count++;
		}
		// if(count==0)
		// 	return 0;
		// else 
			return count+1;
	}
}