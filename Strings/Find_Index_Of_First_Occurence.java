//Find the Index of the First Occurrence in a String Leetcode - 28
package Strings.copy;

public class Find_Index_Of_First_Occurence 
{
	public static void main(String[] args) 
	{
		String a="Balaji";
		String b="ji";
		if(a.contains(b))
		{
			int l1=a.length();
			int l2=b.length();
			for(int i=0;i<l1;i++)
			{
				int c=0;
				for(int j=0;j<l2;j++)
				{
					if(a.charAt(i+j)==b.charAt(j))
						c++;
				}
				if(c==l2)
				{
					System.out.println(c);
					System.out.println(i);
					break;
				}
			}
		}
		else
			System.out.println("No match");
	}
	
}
