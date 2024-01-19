public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int start =0;
		while(start<arr.length){
					int sum1=0;
					int sum2=0;
			for(int i=0;i<start;i++){
				sum1=sum1+arr[i];
			}
			for(int j=start+1;j<arr.length;j++){
				sum2=sum2+arr[j];
			}
			if(sum1==sum2)
				return start;
			else	
				start++;
		}
		return -1;
	}
}