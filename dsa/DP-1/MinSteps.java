public class Solution {

    public static int countMinStepsToOne(int n){
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return countMinStepsToOne(n,dp);
    }
        public static int countMinStepsToOne(int n,int dp[]) {
            // Your code goes here
            if (n == 1) {
                return 0;
            }
            if (n <= 3 && n > 1) {
                return 1;
            }
            int count = 0;
            if ((n % 2 != 0 && n % 3 != 0) || n % 3 == 1) {
                n = n - 1;
                // System.out.println(n);
                count++;
            }
            if (n % 2 == 0) {
                if (n % 3 == 1) {
                    n = n - 1;
                    count++;
                } else {
                    n = n / 2;
                    // System.out.println(n);
                    count++;
                }
            }
            if (n % 3 == 0) {
                n = n / 3;
                // System.out.println(n);
                count++;
            }
            count += countMinStepsToOne(n);
            return count;
        }
    
    }