// leetcode - 242
package Strings;

import java.util.Arrays;

/* Anagram : Def: a word, phrase, or name formed by rearranging the letters of
another, such as silent formed from listen. */

////////////////////// Approach 1 /////////////////////////////////////
	
public class Anagram
{
	static boolean isanagram(String st1,String st2)
	{ 
		int count1[]=noofOccurence(st1);
		
		int count2[]=noofOccurence(st2);
		for (int i = 0; i < count1.length; i++) 
		{
			if(count1[i]!=count2[i])
				return false;
		}
	return true;
}

static int[] noofOccurence(String st)
{
	int[] count=new int[26];
	for (int i = 0; i < st.length(); i++) 
	{
		char ch=st.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			count[ch-65]++;
		}
		if(ch>='a'&&ch<='z')
		{
			count[ch-97]++;
		}
	}
	System.out.println(Arrays.toString(count));
	return count;
}
	public static void main(String[] args)
	{
		String st1="balaji";
		String st2="JILABA";
		boolean bb=Anagram.isanagram(st2, st1);
		if(bb)
			System.out.println(st1+" and "+st2+" are anagram");
		else
			System.out.println("not ");
	}
}


////////////////////// Approach 2 /////////////////////////////////////
/*


class Demo
{
	public static void main(String[] args) 
	{
		String s = "silent";
		String t="listen";
		int[] schar=new int[26];
		for(char ch:s.toCharArray())
			schar[ch-97]++;
		for(char ch:t.toCharArray())
			schar[ch-97]--;
		System.out.println(Arrays.toString(schar));
		for(int i:schar)
		{
			if(i>0)
				System.out.println("Not Anagram");
		}
		
		
	}
}
 */

////////////////////// Approach 3 /////////////////////////////////////

		/*
		char[] charS = s.toCharArray();
		char[] charT = t.toCharArray();
		Arrays.sort(charS);
		Arrays.sort(charT);
		String stringS = new String(charS);
		String stringT = new String(charT);
		return stringS.equals(stringT);
		*/