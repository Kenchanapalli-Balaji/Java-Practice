// leetcode 387
package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_In_String 
{
	public static void main(String[] args) 
	{
		String s= "loveleetcode";
	
		///////////////////// using Array Concept /////////////////
		int[] freq=new int[26];
		for(char ch:s.toCharArray())
		{
			freq[ch-97]++; // freq[ch-'a']
		}
		System.out.println(Arrays.toString(freq));
		for(int i=0;i<s.length();i++)
		{
			if(freq[s.charAt(i)-97]==1)
			{
				System.out.println(s.charAt(i));
				break;
			}			
		}
		
		////////////////// Using Hashmap ///////////////////////
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))==1)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}
