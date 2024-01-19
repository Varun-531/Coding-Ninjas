import java.util.*;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		while(!input.isEmpty()){
			int poper = input.pop();
			extra.push(poper);
		}
		Stack<Integer> ex2 = new Stack<Integer>();
		while(!extra.isEmpty()){
			int poper2 = extra.pop();
			ex2.push(poper2);
		}
		while(!ex2.isEmpty()){
			int pp = ex2.pop();
			input.push(pp);
		}
		
	}
}