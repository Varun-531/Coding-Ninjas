
public class Solution {

	public static int lastIndex(int input[], int x) {
		return se(input, x, input.length-1);
	}
	private static int se(int input[],int x,int li){
		if(li<0)
			return -1;

			if(input[li]==x)
				return li;
		else{
			return se(input, x, li-1);
		}
	}
	
}