// leetcode - 451
/*
 Given a string s, sort it in decreasing order based on the frequency of the characters. 
 The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" 
and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
 */
package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_Characters_By_Frequency 
{
	public static void main(String[] args) 
	{
		String s="tree";
		
		//////////////// Using HashMap technique ////////////////////////
		StringBuilder sb=new StringBuilder();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char ch:s.toCharArray())
		{
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		List<Character> list=new ArrayList<Character>(hm.keySet());
		System.out.println(list);
		list.sort((a,b)->hm.get(b)-hm.get(a)); // Descending Order based on their frequency
		for(char ch:list)
		{
			for(int i=0;i<hm.get(ch);i++)
				sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}
