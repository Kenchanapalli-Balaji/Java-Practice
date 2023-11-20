package Strings.copy;

import java.util.Arrays;

class First_Letter_Upper_Case
{
	public static void main(String args[])
	{
		String st="RaMa    ANd laxmanA";
		
		char ch[]=st.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' ' || ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else 
			{
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		String str=new String(ch);
		System.out.println(str);
	}
}


/*
class Test
{
	public static void main(String[] args) {
		String st="raMa and laXMana";
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>'A' && ch[i]<'Z')
					ch[i]=(char)(ch[i]+32);
				else if(ch[i]>'a' && ch[i]<'z')
					ch[i]=(char)(ch[i]-32);
				
			}
			else 
			{
				if(ch[i]>'A' && ch[i]<'Z')
					ch[i]=(char)(ch[i]+32);
				
			}
		}
		String str=new String(ch);
		System.out.println(str);
	}
}

*/ 