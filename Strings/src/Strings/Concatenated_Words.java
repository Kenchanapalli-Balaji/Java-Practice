// leetcode - 472
// https://youtu.be/Q2Jo4i8JLmc?list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
/*
 Given an array of strings words (without duplicates), 
 return all the concatenated words in the given list of words.

A concatenated word is defined as a string that is comprised entirely 
of at least two shorter words (not necessarily distinct) in the given array.

Example 1:

Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog",
"hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".

Example 2:

Input: words = ["cat","dog","catdog"]
Output: ["catdog"]
 
 */
package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Concatenated_Words 
{
	public static void main(String[] args) 
	{
		String words[] = {"cat","dog","catdog"};
		System.out.println(findAllConcatenatedWordsInADict(words));	
	}
	static List<String> findAllConcatenatedWordsInADict(String[] words)
	{
		Set<String> set=new HashSet<String>();
		List<String> res=new ArrayList<String>();
		for(String s:words)
			set.add(s);
		for(String word:words)
		{
			if(isConcatenated(word,set)==true)
				res.add(word);
		}
		return res;
		
	}
	static boolean isConcatenated(String s, Set<String> set)
	{
		for(int i=1;i<s.length();i++)
		{
			String prefix=s.substring(0,i);
			String suffix=s.substring(i,s.length());
			// what if we have array like {"ca","t","dog","catdog"} here "ca" and "t" also 
			// concatenated , Soo we are checking suffix again with sub arrays of it
			if(set.contains(prefix) && (set.contains(suffix) || isConcatenated(suffix, set)))
				return true;
		}
		return false;
	}
}
