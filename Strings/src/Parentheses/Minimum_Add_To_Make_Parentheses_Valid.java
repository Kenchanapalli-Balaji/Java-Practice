// leetcode - 921
//
/*
 A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any 
position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a 
closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

Example 1:

Input: s = "())"
Output: 1
 */
package Parentheses;

public class Minimum_Add_To_Make_Parentheses_Valid 
{
	public static void main(String[] args) 
	{
		String s="())";
		int open=0; int close=0;
		for(char c:s.toCharArray())
		{
			if(c=='(')
				open++;
			else 
			{
				if(open>0)
					open--;
				else
					close++;
			}
		}
		System.out.println(open+close);
	}
}
