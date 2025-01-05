//Find the Index of the First Occurrence in a String Leetcode - 28
package Strings;

public class Find_Index_Of_First_Occurence 
{
	public static void main(String[] args) 
	{
		String a="Balaji";
		String b="ji";
		System.out.println(a.contains(b));
		if(a.contains(b))
		{
			int l1=a.length();
			int l2=b.length();
			for(int i=0;i<l1;i++)
			{
				int c=0;
				for(int j=0;j<l2;j++)
				{
					System.out.println("i+j->"+a.charAt(i+j)+" , j->"+b.charAt(j));
					if(a.charAt(i+j)==b.charAt(j))
						c++;
				}
				if(c==l2)
				{
					System.out.println("Length of teh characters: "+c);
					System.out.println("Index of the Matching in First String: "+i);
					break;
				}
			}
		}
		else
			System.out.println("No match");
	}
	
}
