package Strings;

import java.util.Stack;

/*
public class Reverse 
{
	public static void main(String[] args) 
	{
		String st="Balaji";
		String rev="";
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		rev=new String(ch);
		System.out.println("Original String : "+st);
		System.out.println("Reverse String : "+rev);
	}
}
*/


//Using Stack Algorithm
public class Reverse
{
	public static void main(String[] args) 
	{
		String str="Balaji";
		Stack<Character> stk=new Stack<>();
		char[] chars=str.toCharArray();
		for(char i=0;i<chars.length;i++)
		{
			stk.push(chars[i]);
		}
		for(int i=0;i<str.length();i++)
		{
			chars[i]=stk.pop();
		}
		String rev=new String(chars);
		System.out.println(str);
		System.out.println(rev);
	}
}