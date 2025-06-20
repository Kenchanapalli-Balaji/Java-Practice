// https://youtu.be/sKaqSCXul0k
// leetcode - 205 
/*
 Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character
 while preserving the order of characters. No two characters may map to the same 
 character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"
Output: false

Explanation:

The strings s and t can not be made identical as 'o' 
needs to be mapped to both 'a' and 'r'
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings 
{
	public static void main(String[] args) 
	{
		String s="egg";
		String t="add";
		/////////////////// Using Arrays /////////////////
		/*
		int m1[]=new int[128];  // ASCII Values 
		int m2[]=new int[128];
		boolean isIsomorphic=true;
		for(int i=0;i<s.length();i++)
		{
			if(m1[s.charAt(i)]!=m2[t.charAt(i)])
				isIsomorphic=false;
			m1[s.charAt(i)]=i+1;
			m2[t.charAt(i)]=i+1;
		}
		System.out.println(isIsomorphic);
		*/
		////////////// using HashMap Method //////////////////////////
		
		Map<Character, Character> hm=new HashMap<Character, Character>();
		boolean isIsomorphic=true;
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				if(hm.get(s.charAt(i)) !=t.charAt(i))
					isIsomorphic = false;
			}
			else if(hm.containsValue(t.charAt(i)))
				isIsomorphic= false;
			hm.put(s.charAt(i), t.charAt(i));
		}
		System.out.println(hm);
		System.out.println(isIsomorphic);
	}
}
