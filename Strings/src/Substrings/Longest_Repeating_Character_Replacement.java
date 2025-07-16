// leetcode - 424
// https://youtu.be/_eNhaDCr6P0
/*
 You are given a string s and an integer k. You can choose any character of 
 the string and change it to any other uppercase English character. 
 You can perform this operation at most k times.

Return the length of the longest substring containing the same letter 
you can get after performing the above operations.
Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
 */
package Substrings;

import java.util.HashMap;
import java.util.Map;

public class Longest_Repeating_Character_Replacement 
{
	public static void main(String[] args) 
	{
		String s="AABABBA"; 
		int k=2;
		
		//////////////////////// Sliding Window technique ////////////////
		
		int count=0; int maxfreq=0;
		int left=0; int right=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		while(right<s.length())
		{
			char c=s.charAt(right);
			map.put(c, map.getOrDefault(c,0)+1);
			maxfreq=Math.max(maxfreq, map.get(c));
			
			while((right-left+1)-maxfreq>k)
			{
				map.put(s.charAt(left), map.get(s.charAt(left))-1);
				left++;
			}
			count=Math.max(count, right-left+1);
			right++;
		}
		System.out.println(count);
	}
}
