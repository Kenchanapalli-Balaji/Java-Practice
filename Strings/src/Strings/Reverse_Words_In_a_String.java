// leetcode - 151
/*
 Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be 
separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. 
Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
 */
package Strings;

import java.util.Arrays;

public class Reverse_Words_In_a_String 
{
	public static void main(String[] args) 
	{
		String s="the sky is blue";
		System.out.println(s);
		String words[]=s.split("\\s");
		/////////////////// Approach 1 /////////////////
		/*
		int start=0; int end=words.length-1;
		while(start<=end)
		{
			String temp=words[start];
			words[start]=words[end];
			words[end]=temp;
			start++;
			end--;
		}
		String res=Arrays.toString(words);
		System.out.println(res);
		*/
		
		///////////////// Approach 2/////////////////
        StringBuilder res=new StringBuilder();
		for(int i=words.length-1;i>=0;i--)
		{
			res.append(words[i]);
			if(i>0) // i(!=0)
				res.append(" ");
		}
		System.out.println(res.toString());
	}
}
