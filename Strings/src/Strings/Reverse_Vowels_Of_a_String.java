// leetcode - 345
/*
 Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both 
lower and upper cases, more than once.

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 */
package Strings;

public class Reverse_Vowels_Of_a_String 
{
	public static void main(String[] args) 
	{
		String s="IceCreAm";
		int start=0;
		int end=s.length()-1;
		char[] c=s.toCharArray();
		while(start<=end)
		{
			if(!isVowel(c[start]))  // if present char is not vowel
				start++;
			else if(!isVowel(c[end]))
				end--;
			else  // if both start and end vowels, then swapping them
			{
				char temp=c[start];
				c[start]=c[end];
				c[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(c));
		
	}
	static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;
		return false;
	}
}
