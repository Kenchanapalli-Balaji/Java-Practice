// leetcode - 397
// https://leetcode.com/problems/integer-replacement/solutions/7134820/no-bfs-no-dfs-most-optimal-greedy-with-s-n241/?envType=problem-list-v2&envId=greedy
/*
Given a positive integer n, you can apply one of the following operations:

If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n - 1.
Return the minimum number of operations needed for n to become 1.

Example 1:

Input: n = 8
Output: 3
Explanation: 8 -> 4 -> 2 -> 1
 */
package Greedy_Algorithms;

public class Integer_Replacement {
	public static void main(String[] args) {
		long n=8;
		int count=0;
		while(n!=1)
		{
			if(n%2==0)
				n=n/2;
			else
			{
				if(n==3 || n%4==1)
					n--;
				else
					n++;
			}
			count++;
		}
		System.out.println(count);
	}

}
