import java.util.*;

public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i:input){
			pq.add(i);
		}
		while(pq.size()!=k){
			pq.poll();
		}
		ArrayList<Integer>arr = new ArrayList<>();
		while(pq.size()!=0){
			int a = pq.poll();
			arr.add(a);
		}
		return arr;
	}
}