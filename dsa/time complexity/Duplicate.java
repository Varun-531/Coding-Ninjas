import java.util.*;

public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
		// for(int i=0;i<arr.length;i++){
		// 	int count=0;
		// 	for(int j=i;j<arr.length;j++){
		// 		if(arr[i]==arr[j])
		// 			count++;
		// 	}
		// 	if(count==2)
		// 		return arr[i];
		// }
		// return -1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1])
				return arr[i];
		}
		return -1;
	}
}