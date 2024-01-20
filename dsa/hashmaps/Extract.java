import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		String s = "";
		for(int j=0;j<str.length();j++){
			char i = str.charAt(j);
			if(map.containsKey(i)){
				continue;
			}
			else{
				map.put(i, 1);
				s = s+i;
			}
		}
		return s;
	}
}