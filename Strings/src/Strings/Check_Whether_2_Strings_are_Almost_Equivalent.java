// leetcode - 2068
// https://youtu.be/Jf7FlJfwy50?list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
/*
Two strings word1 and word2 are considered almost equivalent if the differences 
between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.

Given two strings word1 and word2, each of length n, return true if 
word1 and word2 are almost equivalent, or false otherwise.

The frequency of a letter x is the number of times it occurs in the string.

Example 1:

Input: word1 = "aaaa", word2 = "bccb"
Output: false
Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
The difference is 4, which is more than the allowed 3.
Example 2:

Input: word1 = "abcdeef", word2 = "abaaacc"
Output: true
Explanation: The differences between the frequencies of each letter in 
word1 and word2 are at most 3:
- 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
- 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
- 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
- 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
- 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
- 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.
 */
package Strings;

import java.util.Arrays;

public class Check_Whether_2_Strings_are_Almost_Equivalent 
{
	public static void main(String[] args) 
	{
		String s1="abcdeef"; 
		String s2="abaaacc";
		int[] freq=new int[26];
		boolean isEqivalent=true;
		for(int i=0;i<s1.length();i++)
		{
			freq[s1.charAt(i)-97]++;  // freq[s1.charAt(i)-'a']++
			freq[s2.charAt(i)-97]--;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(Math.abs(freq[i])>3)
			{
				isEqivalent=false;
				break;
			}
				
		}
		System.out.println(isEqivalent);	
	}
}
