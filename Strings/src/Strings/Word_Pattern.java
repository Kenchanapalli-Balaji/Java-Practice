// leetcode- 290
// https://youtu.be/b_pNf56VIqY?list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
/*
 Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between 
a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 
Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Explanation:

The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern 
{
	public static void main(String[] args) 
	{
		
		String pattern="abba";
		String s="dog cat cat dog";
		Map<Character, String> hm=new HashMap<Character, String>();
		String arr[]=s.split("\\s+");
		boolean isIsomorphic=true;
        if (pattern.length() != arr.length)
            isIsomorphic= false;
		
		for(int i=0;i<pattern.length();i++)
		{
			if(hm.containsKey(pattern.charAt(i)))
			{
				if(!hm.get(pattern.charAt(i)).equals(arr[i]))
					 isIsomorphic=false;	
			}
			else if(hm.containsValue(arr[i]))
				isIsomorphic=false;
			hm.put(pattern.charAt(i), arr[i]);
		}
		System.out.println(hm);
		System.out.println(isIsomorphic);
	}
}
