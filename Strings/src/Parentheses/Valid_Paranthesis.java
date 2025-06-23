package Parentheses;

import java.util.Stack;

public class Valid_Paranthesis 
{
	public static void main(String[] args) 
	{
		System.out.println(isValid("({[]})"));
		System.out.println(vaild("({[]})"));
	}
	///////////////////////////// Approach 1 Using Stack //////////////////////
	private static boolean isValid(String st) 
	{
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='{'||ch=='['||ch=='(')
				stk.push(ch);
			else if(ch=='}'||ch==']'||ch==')')
			{
				if(stk.isEmpty())
					return false;
				char pc=stk.pop();
				switch(ch)
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
	
	//////////////////////////// Approach 2 /////////////////////////
	public static boolean vaild(String s)
	{
		while(true)
		{
			if(s.contains("()"))
				s=s.replace("()", ""); // replacing with null value
			else if(s.contains("[]"))
				s=s.replace("[]", "");
			else if(s.contains("{}"))
				s=s.replace("{}", "");
			else
				return s.isEmpty();
					
		}
	}
}
