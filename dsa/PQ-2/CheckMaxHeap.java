import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		 PriorityQueue<Integer> pq = new PriorityQueue<>();
		 Stack<Integer> stack = new Stack<>();
		 for(int i:arr){
			 pq.add(i);
			 stack.add(i);
		 }
		 while(stack.size()!=0){
			 int a = stack.pop();
			 int b = pq.poll();
			 if(a!=b)
			 	return false;
		 }
		 return true;
	}
}