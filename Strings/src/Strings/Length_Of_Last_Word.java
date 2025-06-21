// leetcode - 58
package Strings;

public class Length_Of_Last_Word 
{
	public static void main(String[] args) 
	{
		String s="  Hello world  ";
		
		///////////// Approach 1 ///////////
		String[] words=s.split("\\s+");
		System.out.println(words[words.length-1].length());
		
		///////// Approach 2 /////////////
		s=s.trim(); // it will remove leading spaces if any
		int count=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
				count++;
			else
				break;
		}
		System.out.println(count);
		
	}
}
