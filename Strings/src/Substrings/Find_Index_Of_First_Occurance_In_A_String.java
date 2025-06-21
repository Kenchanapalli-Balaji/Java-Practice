//leetcode -28
// https://youtu.be/OWaZ6AosS30?list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
package Substrings;

import java.util.ArrayList;
import java.util.List;

public class Find_Index_Of_First_Occurance_In_A_String 
{
	public static void main(String[] args) 
	{
		String a="xyzabxyzabxyz";
		String b="xyz";
		List<Integer> list=new ArrayList<Integer>();
		if(a.contains(b))
		{
			int l1=a.length();
			int l2=b.length();
			for(int i=0;i<=l1-l2;i++)
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
					System.out.println("Length of the characters: "+c);
					System.out.println("Index of the Matching in First String: "+i);
					list.add(i);
				}
			}
		}
		else
			System.out.println("No Match");
		System.out.println(list);
		
		//////////////////// Approach 2 Using Substring //////////////////////
		int l1=a.length();
		int l2=b.length();
		for(int i=0;i<=l1-l2;i++)
		{
			if(a.charAt(i)==b.charAt(0))
			{
				if(a.substring(i,l2+i).equals(b))
				{
					System.out.println("Fist Index of :"+b +" is->"+ i);
					break;
				}
			}
		}
		
		//////////////////// Approach 3 Using indexOf() Method //////////////
		
		System.out.println(a.indexOf(b));
		
	}
}
