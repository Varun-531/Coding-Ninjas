import java.util.*;
public class solution {
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
		// Write your code here
		int profit = Integer.MIN_VALUE;
		for(int i=0;i<budget.length;i++){
			int count=0;
			int m = budget[i];
			count = budget.length-i;
			if(profit<count*m)
				profit=count*m;
		}
		return profit;
	}

}
