public class Solution {

	public static int minCount(int n){
		int dp[] = new int[n+1];
		for(int i=0;i<n+1;i++){
			dp[i]=-1;
		}
		return minCount(n, dp);
	}
	public static int minCount(int n,int dp[]) {
		//Your code goes here
		if(n==0){
			return 0;
		}
		int minAns=Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++){
			int currAns;
			if(dp[n-(i*i)]==-1){
				currAns = minCount(n - (i * i),dp);
				dp[n-(i*i)]=currAns;
			}else{
				currAns=dp[n-(i*i)];
			}
			minAns=Math.min(minAns,currAns);
		}
		return minAns+1;
	}

}