package DSA.hashmaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		HashMap<Integer,Integer> map1 = new HashMap<>();
		for(int i:arr1){
			if(map1.containsKey(i)){
				int f = map1.get(i);
				map1.put(i,f+1);
			}
			else{
				map1.put(i, 1);
			}
		}
		for(int i:arr2){
			if(map1.containsKey(i)){
				if(map1.get(i)!=0){
					System.out.println(i);
					int f = map1.get(i);
					map1.remove(i);
					map1.put(i, f-1);}
				else
					continue;
			}
		}
	}
}