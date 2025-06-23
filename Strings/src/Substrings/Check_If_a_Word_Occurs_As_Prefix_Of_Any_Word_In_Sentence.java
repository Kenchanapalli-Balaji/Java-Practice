// leetcode - 1455
/*
 Given a sentence that consists of some words separated by a single space, 
 and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord 
is a prefix of this word. If searchWord is a prefix of more than one word, 
return the index of the first word (minimum index). If there is no such word return -1.
A prefix of a string s is any leading contiguous substring of s.
Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
 */
package Substrings;

import java.util.Arrays;

public class Check_If_a_Word_Occurs_As_Prefix_Of_Any_Word_In_Sentence 
{
	public static void main(String[] args) 
	{
		String sentence = "i love eating burger";
		String word="burg";
		String words[]=sentence.split("\\s+");
		
		System.out.println(Arrays.toString(words));
		for(int i=0;i<words.length;i++)
		{
			if(words[i].startsWith(word))
			{
				System.out.println(i+1);
				break;
			}
		}
	}
}
