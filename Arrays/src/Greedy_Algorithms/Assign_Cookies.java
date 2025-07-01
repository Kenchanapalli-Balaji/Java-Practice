// leetcode - 455
// https://youtu.be/DIX2p7vb9co?list=PLgUwDviBIf0rF1w2Koyh78zafB0cz7tea
/*
 Assume you are an awesome parent and want to give your children some cookies. But, 
 you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the 
child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], 
we can assign the cookie j to the child i, and the child i will be content. 
Your goal is to maximize the number of your content children and output the maximum number.

Example 2:
============
Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Assign_Cookies 
{
	public static void main(String[] args) 
	{
		int[] g = {1,2}; int[] s = {1,2,3};
		System.out.println(fun(g,s));
	}
	static int fun(int[] g, int[] s)
	{
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i=0;
		int j=0;
		while(i<g.length && j<s.length)
		{
			if(s[j]>=g[i])
				i++;
			j++;
		}
		return i;
	}
}
