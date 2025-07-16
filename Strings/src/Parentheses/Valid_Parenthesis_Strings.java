// leetcode - 678
// https://youtu.be/cHT6sG_hUZI
/*
 Given a string s containing only three types of characters: '(', ')' and '*', 
 return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis 
'(' or an empty string "".
 
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "(*)"
Output: true
 */

package Parentheses;

public class Valid_Parenthesis_Strings 
{
	public static void main(String[] args) 
	{
		String s="(*))";
		System.out.println(validString(s));
	}
	static boolean validString(String s)
	{
		int leftmin=0; int leftmax=0;
		for(char c:s.toCharArray())
		{
			if(c=='(')
			{
				leftmin++;
				leftmax++;
			}
			else if(c==')')
			{
				leftmin--;
				leftmax--;
			}
			else
			{
				leftmin--;
				leftmax++;
			}
			//  If leftMin becomes negative, reset it to 0 since we can't have negative open
			// parentheses count
			if(leftmin<0)
				leftmin=0;
			 //  If leftMax becomes negative at any point, return False since it means there are 
			//more closing parentheses than opening ones
			if(leftmax<0)	
				return false;
		}
		return leftmin==0;
	}
}
