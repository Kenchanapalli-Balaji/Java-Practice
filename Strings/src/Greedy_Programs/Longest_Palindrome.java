// leetcode - 409
/*
 Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with 
 those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
package Greedy_Programs;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {
	public static void main(String[] args) 
	{
		String s= "abccccdd";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c:s.toCharArray())
			map.put(c,map.getOrDefault(c,0)+1);
		int length=0;
		boolean hasOdd = false;
		for(int count:map.values())
		{
			if(count%2==0)
				length+=count;
			else {
				length+=count-1;
				hasOdd=true;
			}
		}
		if(hasOdd)
			length+=1;
		System.out.println("Longest Palindrome is : "+length);
		
	}

}
