import java.util.HashMap;

public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i:arr){
			if(map.containsKey(i)){
				int f = map.get(i);
				map.put(i, f+1);
			}
			else{
				map.put(i,1);
			}
		}
		int max = 0;
		int maxx = 0;
		for(int i:arr){
			if(map.get(i)>max){
				maxx = i;
				max = map.get(i);}
		}
		return maxx;
    }
}

