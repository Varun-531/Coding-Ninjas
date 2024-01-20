package DSA.Stack;
import java.util.Stack;

public class Solution {

	public static boolean checkRedundantBrackets(String str) {
		//Your code goes here
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=')')
				stack.push(str.charAt(i));
			else{
				int count=0;
				while(stack.peek()!='('){
					stack.pop();
					count=count+1 ;
				}
				if(stack.peek()=='(')
					stack.pop();
				if(count==0||count==1)
					return true;
			}
		}
		return false;
	}

}