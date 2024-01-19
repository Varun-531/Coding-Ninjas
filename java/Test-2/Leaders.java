public class Solution {
	public static void leaders(int[] input) {
		// int num = Integer.MIN_VALUE;
		for(int i =0;i<input.length;i++){
			int c =0;
			for(int j=i+1;j<input.length;j++){
				if(input[i]<input[j]){
					c=1;
					break;}
			}
			if(c==0)
				System.out.print(input[i]+" ");
		}
	}
}