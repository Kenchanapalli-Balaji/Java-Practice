//leetcode - 2506
/*
 Input: words = ["aba","aabb","abcd","bac","aabc"]
Output: 2
Explanation: There are 2 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
- i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'.
 */
package Strings;

import java.util.HashSet;
import java.util.Set;

public class Count_Pairs_Of_Similar_Strings 
{
	public static int  countOfPairs(String words[])
	{
		int count=0;
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				count+=checks(words[i],words[j]);
			}
		}
		return count;
	}
	
	public static int checks(String i, String j)
	{
		Set<Character> iset=new HashSet<>();
		Set<Character> jset=new HashSet<>();
		for(char c:i.toCharArray())
		{
			iset.add(c);
		}
		for(char c:j.toCharArray())
		{
			jset.add(c);
		}
		if(iset.equals(jset))
			return 1;
		else
			return 0;
		
	}
	public static void main(String[] args) 
	{
		String words[]= {"aba","aabb","abcd","bac","aabc"};
		System.out.println(countOfPairs(words));
	}
}
