import java.util.*;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i:input){
			pq.add(i);
		}
		if(n<=k){
			while(pq.size()!=0)
				arr.add(pq.poll());
		}
		else{
			while(arr.size()!=k){
				arr.add(pq.poll());
			}
		}
		return arr;
	}
}