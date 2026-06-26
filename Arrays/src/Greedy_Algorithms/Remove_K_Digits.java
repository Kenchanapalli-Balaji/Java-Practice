// leetcode - 402
/*
 Given string num representing a non-negative integer num, and an integer k, 
 return the smallest possible integer after removing k digits from num.

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. 
Note that the output must not contain leading zeroes.
 */
package Greedy_Algorithms;

import java.util.Stack;

public class Remove_K_Digits {
	public static void main(String[] args) {
		String n= "1432219";
		int k= 3;
		Stack<Character> stk = new Stack<>();
		for(char c:n.toCharArray())
		{
			while(!stk.isEmpty() && k>0 && stk.peek()>c)
			{
				stk.pop();
				k--;
			}
			stk.push(c);
		}
		 // Remove remaining k digits from the end of the stack
		while(!stk.isEmpty() && k>0) {
			stk.pop();
			k--;
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stk.isEmpty())
			sb.append(stk.pop());
		sb.reverse(); // Reverse to get the correct order
		
		 // Remove leading zeros
		 while(sb.length()>0 && sb.charAt(0) == '0')
			 sb.deleteCharAt(0);
		 System.out.println(sb.length()>0 ? sb.toString() : "0");
		 
	}

}
