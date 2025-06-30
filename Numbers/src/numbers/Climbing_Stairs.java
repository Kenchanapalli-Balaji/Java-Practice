// leetcode - 70
// https://youtu.be/cGTFd5MbJ_4?list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am
/*
 You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you
 climb to the top?

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
package numbers;

public class Climbing_Stairs 
{
	public static void main(String[] args) 
	{
		int n=3;
		System.out.println(count(n));
	}
	/////////////// Fibonacci Series ////////////////
	// 1,2,3,5,8,13,........
	static int count(int n)
	{
		if(n<=3)
			return n;
		int a=3;
		int b=2;
		for(int i=0;i<n-3;i++)
		{
			a=a+b;
			b=a-b;
		}
		return a;
	}
}
