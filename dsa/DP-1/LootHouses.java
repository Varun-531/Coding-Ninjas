public class Solution {

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
		if(houses.length==0){
			return 0;
		}
		int ans=0;
		int arr[]=houses;
		int dp[]= new int[houses.length];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0],arr[1]);
		for(int i=2;i<houses.length;i=i+1){
			dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
		}
		return dp[dp.length-1];
	}

}