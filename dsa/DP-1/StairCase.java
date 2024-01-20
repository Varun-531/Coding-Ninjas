public class Solution {

    public static long staircase(int n) {
        //Your code goes here
        long dp[] = new long[n+1];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return staircaseHelper(n,dp);
    }
    public static long staircaseHelper(int n,long dp[]){
        if(n<=1){
            return 1;
        }
        if(n==2){
            return n;
        }
        if(n==3){
            return n+1;
        }
        long ans2,ans1,ans3;
        if(dp[n-1]==-1){
            ans1= staircaseHelper(n-1,dp);
            dp[n-1]=ans1;
        }else{
            ans1=dp[n-1];
        }
        if (dp[n - 2] == -1) {
            ans2 = staircaseHelper(n - 2, dp);
            dp[n - 2] = ans2;
        } else {
            ans2 = dp[n - 2];
        }
        if (dp[n - 3] == -1) {
            ans3 = staircaseHelper(n - 3, dp);
            dp[n - 3] = ans3;
        } else {
            ans3 = dp[n - 3];
        }
        return ans1+ans2+ans3;
    }

}