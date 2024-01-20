package DSA.hashmaps;
import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		HashMap<Integer,Integer> map = new HashMap<>();
		int count = 0;
		for(int i:input){
			if(map.containsKey(-1*i)){
				int f = map.get(-1*i);
				count = count + f;
				if(map.containsKey(i)){
					int v = map.get(i);
					map.put(i, v+1);
				}
				else
					map.put(i, 1);
			}
			else{
				if(map.containsKey(i)){
					int v = map.get(i);
					map.put(i, v+1);
				}
				else{
					map.put(i, 1);
				}
			}
		}
		return count;
	}
}