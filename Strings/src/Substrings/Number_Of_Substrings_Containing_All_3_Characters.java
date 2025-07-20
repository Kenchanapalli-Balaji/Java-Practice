// leetcode - 1358
// https://youtu.be/xtqN4qlgr8s
/*
 Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these 
characters a, b and c.
Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters 
a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", 
"cabc" and "abc" (again). 
 */
package Substrings;

import java.util.HashSet;
import java.util.Set;

public class Number_Of_Substrings_Containing_All_3_Characters 
{	
	public static void main(String[] args) 
	{
		String s="abcabc";
		System.out.println(count(s));
	}
	
	/////////////////////////// Brute Force Approach /////////////////
	/*
	static int count(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			Set<Character> set=new HashSet<Character>();
			for(int j=i;j<s.length();j++)
			{
				set.add(s.charAt(j));
				if(set.size()==3)
					cnt++;
			}
		}
		return cnt;
	}
	*/
	
	///////////////////////// Sliding Window Approach /////////////////////
	static int count(String s)
	{
		int freq[]=new int[3];
		int count=0;
		int l=0; int r=0;
		while(r<s.length())
		{
			freq[s.charAt(r)-97]++;
		// While window contains at least one 'a', 'b', and 'c'
		// When the window has all three, we know that all substrings starting at left and 
		// ending at right, right+1, ..., n-1 are valid → that’s s.length() - right substrings.
			while(freq[0]>0 && freq[1]>0 && freq[2]>0)
			{
				count+=s.length()-r;  // all substrings ending from right to end
				freq[s.charAt(l)-97]--;
				l++;
			}
			r++;
		}
		return count;
	}

}
