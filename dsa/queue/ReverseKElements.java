import java.util.*;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<>();
		int count = 0;
		while(count!=k){
			int a = input.poll();
			stack.push(a);
			count++;
		}
		while(!stack.isEmpty()){
			int b = stack.pop();
			queue.add(b);
		}
		while(input.peek()!=null){
			int c = input.poll();
			queue.add(c);
		}
	return queue;
	}
}