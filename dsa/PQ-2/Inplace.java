import java.util.*;

public class Solution {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i:arr){
			pq.add(i);
		}
		Stack<Integer> stack = new Stack<>();
		while(pq.size()!=0){
			stack.add(pq.poll());
		}
		int i =0;
		while(stack.size()!=0){
			arr[i] = stack.pop();
			i++;
		}
	}
}