// leetcode - 1614
/*
 Given a valid parentheses string s, return the nesting depth of s. 
 The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input: s = "(1)+((2))+(((3)))"]
Output: 3
Explanation:
Digit 3 is inside of 3 nested parentheses in the string.
 */
package Parentheses;

public class Maximum_Nesting_Depth_Of_The_Paretheses 
{
	public static void main(String[] args) 
	{
		String s = "(1)+((2))+(((3)))";
		int max=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				count++;
			if(s.charAt(i)==')')
				count--;
			max=Math.max(max, count);
		}
		System.out.println(max);
	}
}
