// leetcode - 917
/*
 Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
 */
package Strings;

public class Reverse_Only_Letters 
{
	public static void main(String[] args) 
	{
		String s="ab-cd";
		int start=0;
		int end=s.length()-1;
		char[] ch=s.toCharArray();
		while(start<end)
		{
			if(!Character.isLetter(ch[start]))
				start++;
			if(!Character.isLetter(ch[end]))
				end--;
			else
			{
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(ch));
	}
}
