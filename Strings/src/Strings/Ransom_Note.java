// leetcode - 383
/*
 Given two strings ransomNote and magazine, return true 
 if ransomNote can be constructed by using the letters 
 from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
package Strings;

import java.util.Arrays;

public class Ransom_Note 
{
	public static void main(String[] args) 
	{
		String s="aab";
		String t="aab";
		boolean isRansom=true;
		int[] arr=new int[26];
		for(char ch:t.toCharArray())
			arr[ch-97]++;
		for(char ch:s.toCharArray())
		{
			if(arr[ch-97]==0)
			{
				isRansom=false;
				break;
			}
			arr[ch-97]--;
		}
		System.out.println(isRansom);
	}
}
