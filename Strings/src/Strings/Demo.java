package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println(isValid("({[]})"));
		
	}
	static boolean isValid(String st)
	{
		Stack<Character> stk=new Stack<Character>();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(')
				stk.push(ch);
			else if(ch=='}' || ch==']' || ch==')')
			{
				if(stk.isEmpty())
					return false;
				char pc = stk.pop();
				switch (ch) 
				{
				case '}': if(pc!='{')
							return false;
							break;
				case ']': if(pc!='[')
						return false;
						break;
				case ')': if(pc!='(')
						return false;
						break;			
				}	
			}
		}
		return stk.isEmpty();
	}
}
