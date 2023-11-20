// program to find the sum of numbers in an ALPHA NUMERIC STRING
package Strings.copy;

public class Sum_Of_Numbers_In_String 
{
	public static void main(String[] args) 
	{
		String st="139y1d5801";
		int sum=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				sum+=ch[i]-48;
			}
		}
		System.out.println(sum);
	}
}
