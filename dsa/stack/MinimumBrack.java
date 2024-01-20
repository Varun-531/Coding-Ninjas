package DSA.Stack;
import java.util.Stack;

public class Solution {

	public static int countBracketReversals(String input) {
		int count=0;
		//Your code goes here
		if(input.length()%2!=0)
			return -1;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<input.length();i++){
			char curr = input.charAt(i);
			if(curr=='{')
				stack.push(curr);
			else{
				if(stack.isEmpty()||stack.peek()=='}')
					stack.push(curr);
				else{
					stack.pop();
				}
			}
		}
		while(!stack.isEmpty()){
			char c1 = stack.pop();
			char c2 = stack.pop();
			if(c1==c2)
				count++;
			else{
				count=count+2;
			}
		}
		return count;
	}

}