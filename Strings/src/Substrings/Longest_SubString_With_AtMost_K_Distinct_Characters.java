// leetcode - 340 
//https://youtu.be/teM9ZsVRQyc
/*
 Given a string s and an integer k.Find the length of the longest substring with at 
 most k distinct characters.

Examples:
Input : s = "aababbcaacc" , k = 2

Output : 6

Explanation : The longest substring with at most two distinct characters is "aababb".

The length of the string 6.
 */
package Substrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Longest_SubString_With_AtMost_K_Distinct_Characters 
{
	public static void main(String[] args) 
	{
		String s="aababbcaacc";
		int k=2;
		System.out.println(fun(s,k));
	}
	
	////////////////////////// BruteForce Approach ///////////////////////
	/*
	static int fun(String s, int k)
	{
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			Set<Character> set=new HashSet<Character>();
			for(int j=i;j<s.length();j++)
			{
				set.add(s.charAt(j));
				if(set.size()==k)
					max=Math.max(max, j-i+1);
				else if(set.size()>k)
					break;
			}
		}
		return max;
	}
	*/
	
	static int fun(String s, int k)
	{
		int max=0;
		int l=0; int r=0;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		while(r<s.length())
		{
			map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
			while(map.size()>k)
			{
				map.put(s.charAt(l), map.get(s.charAt(l))-1);
				if(map.get(s.charAt(l))==0)
					map.remove(s.charAt(l));
				l++;
			}
			max=Math.max(max, r-l+1);
			r++;
		}
		return max;
	}
}
