// leetcode - 70  ( Fibanacci Series)
// https://www.youtube.com/watch?v=mLfjzJsN8us
/*
 You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
package Dynamic_Programming;

import java.util.Arrays;

public class Climbing_Stairs {
	public static void main(String[] args) {
		int n =5;
		System.out.println(fib(n));
		System.out.println(tabulation(n));
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(memoization(n, dp));
	}
	
	static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	static int tabulation(int n)
	{
		if(n<=1)
			return 1;
		int[] dp= new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	static int memoization(int n, int[] dp)
	{
		if(n<=1)
			return n;
		if(dp[n]!=-1)
			return dp[n];
		dp[n]=memoization(n-1,dp)+memoization(n-2,dp);
		return dp[n];
	}

}
