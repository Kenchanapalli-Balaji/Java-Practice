// leetcode - 1221
/*
 Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
package Greedy_Programs;

public class Split_String_In_Balanced_Strings {
	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		int balance=0; int count=0;
		for(char c:s.toCharArray())
		{
			if(c=='L')
				balance++;
			else if(c=='R')
				balance--;
			if(balance==0)
				count++;
		}
		System.out.println(count);
	}
	
}
