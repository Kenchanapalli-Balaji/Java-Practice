// leetcode - 3
// https://youtu.be/VvS_CtSIeiQ?list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
package Substrings;

import java.util.ArrayList;
import java.util.List;

public class Length_Of_Longest_Substring_Without_Repeating_Characters 
{
	public static void main(String[] args) 
	{
		String s="abcabcbb";
		int max_length=0;
		int start=0; int end=0;
		List<Character> list=new ArrayList<Character>();
		while(end<s.length())
		{
			if(!list.contains(s.charAt(end)))
			{
				list.add(s.charAt(end));
				end++;
				max_length=Math.max(max_length, list.size());
			}
			else
			{
				list.remove(Character.valueOf(s.charAt(start))); // 
				start++;
			}	
		}
		System.out.println(max_length);
	}

}
