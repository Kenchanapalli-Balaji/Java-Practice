package testing;

public class Remove_Vowels_From_String 
{
	public static void main(String[] args)
	{
		String s="what is your name";
		StringBuffer sb=new StringBuffer();
		for(char c:s.toCharArray())
		{
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
				sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
