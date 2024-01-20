import java.util.*;

public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i:input){
			pq.add(i);
		}
		Stack<Integer> stack = new Stack<>();
		while(pq.size()!=0){
			stack.add(pq.poll());
		}
		int count =1;
		while(stack.size()!=0){
			if(count == k)
				return stack.pop();
			stack.pop();
			count++;
		}
		return -1;
	}
}