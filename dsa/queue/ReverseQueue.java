package DSA.Queue;
import java.util.*;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		Stack<Integer> stack = new Stack<Integer>();
		while(input.peek()!=null){
			int a = input.poll();
			stack.push(a);
		}
		while(!stack.isEmpty()){
			int b = stack.pop();
			input.add(b);
		}
		//Your code goes here
	}

}