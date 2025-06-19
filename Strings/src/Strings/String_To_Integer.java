// leetcode - 8 
// https://youtu.be/Kfu5xnchVzs
/*
 Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.

 

Example 1:

Input: s = "42"

Output: 42

Explanation:

The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
 */
package Strings;

public class String_To_Integer 
{
	public static void main(String[] args) 
	{
		 String s="9223372036854775808";
		 System.out.println(atoi(s));
			 
	}
	static public int atoi(String s)
	{
		// step 1
		s=s.trim(); // removes leading spaces
		if(s.length()==0)
			return 0;
		
		// step 2 
		
		int index=0;
		char start=s.charAt(0);
		int sign =1;
		if(start=='-')
		{
			sign=-1;
			index++;
		}
		else if(start=='+')
		{
			index++;
		}
		
		// step 3
		long result=0;
		for(int i=index;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') // checking present char is digit or not 
				result=result*10+s.charAt(i)-'0'; // it will convert character to Integer value
			else
				break; // if present char is non didgit , breaking the loop
		}
		
		// step 4 
		result=result*sign;
		if(result>=Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		else if(result<=Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int) result;
	}
}
