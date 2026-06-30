/*
 To find the Nth Fibonacci number using Dynamic Programming, we can use two approaches:

	Memoization (Top-Down DP) → Recursion + storing already calculated results
	Tabulation (Bottom-Up DP) → Iterative approach + building results from base cases
 */
package Dynamic_Programming;

import java.util.Arrays;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 8;
		 int[] dp= new int[n+1];
		 Arrays.fill(dp, -1);
		 System.out.println(memoization(n,dp));
		 System.out.println(tabulation(n));
	}
	
	static int memoization(int n, int[] dp)
	{
		if(n<=1)
			return n;
		if(dp[n]!=-1)
			return dp[n];
		dp[n]=memoization(n-1, dp)+memoization(n-2, dp);
		return dp[n];
				
	}
	
	static int tabulation(int n)
	{
		if(n<=1)
			return n;
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

}
