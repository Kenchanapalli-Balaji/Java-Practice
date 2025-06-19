package Substrings;

public class Print_All_Sub_Strings 
{
	public static void main(String[] args) 
	{
		String s="ABC";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
		
		// Count all the substrings
		// Total Substrings = n * (n + 1) / 2;
	}
}
