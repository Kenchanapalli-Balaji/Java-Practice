// leetcode - 1768
/*
 You are given two strings word1 and word2. Merge the strings 
 by adding letters in alternating order, starting with word1. 
 If a string is longer than the other, append the additional letters 
 onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
 */
package Strings;

public class Merge_Strings_Alternately 
{
	public static void main(String[] args) 
	{
		String s1="abc"; String s2="pqr";
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s1.length() || i<s2.length())
		{
			if(i<s1.length())
				sb.append(s1.charAt(i));
			if(i<s2.length())
				sb.append(s2.charAt(i));
			i++;
		}
		System.out.println(sb.toString());
	}
}
