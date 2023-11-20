package Strings.copy;

import java.util.Arrays;

/* Anagram : Def: a word, phrase, or name formed by rearranging the letters of
another, such as silent formed from listen. */

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
		Anagram an=new Anagram();
		String st1="balaji";
		String st2="JILABA";
		boolean bb=Anagram.isanagram(st2, st1);
		if(bb)
			System.out.println(st1+" and "+st2+" are anagram");
		else
			System.out.println("not ");
	}
}

/*


class Demo
{
	public static void main(String[] args) 
	{
		String st1="Balaji";
		st1=st1.toLowerCase();
		
		String st2="IJALBA";
		st2=st2.toLowerCase();
		
		int ar1[]=new int[26];
		int ar2[]=new int[26];
		
		for(int i=0;i<st1.length();i++)
		{
			if(st1.charAt(i)>='a' && st1.charAt(i)<='z')
				ar1[st1.charAt(i)-97]++;
				//ar1[i]=(st1.charAt(i)-97);
		}
		for(int i=0;i<st2.length();i++)
		{
			if(st2.charAt(i)>='a' && st2.charAt(i)<='z')
				ar2[st2.charAt(i)-97]++;
				//ar2[i]=(st1.charAt(i)-97);
		}
		
		boolean res=true;
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]!=ar2[i])
			{
				res=false;
			}
		}
		
		if(res)
			System.out.println("yes");
		else
			System.out.println("Not");
		
	}
}
 */



/*
char[] charS = s.toCharArray();
char[] charT = t.toCharArray();
Arrays.sort(charS);
Arrays.sort(charT);
String stringS = new String(charS);
String stringT = new String(charT);
return stringS.equals(stringT);
*/