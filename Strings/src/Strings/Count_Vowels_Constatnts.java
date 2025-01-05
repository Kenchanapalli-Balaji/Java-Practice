package Strings;
import java.util.Scanner;
class Count_Vowels_Constants
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String to count vowels & Constants: ");
		String st=sc.nextLine();
		int vc=0;
		int cc=0;
		for (int i=0;i<st.length();i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
				{
				    vc++;
				}
				else
					cc++;	
				
			}
				
			else if(st.charAt(i)>='a' && st.charAt(i)<='z')
			{
				if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
				{
					vc++;
					
				}
				else
					cc++;
			}
		}
		System.out.println("the number OF Vowels in given String: "+vc);
		System.out.println("the number OF Constants letters in given String:"+cc);
	}
}