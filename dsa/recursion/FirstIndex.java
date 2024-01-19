
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return se(input,x,0);
	}
	private static int se(int input[],int x,int si){
		if(si==input.length){
			return -1;
		}
		if(input[si]==x)
				return si;
		else{
			return se(input,x,si+1;)
		}
		}
	}
