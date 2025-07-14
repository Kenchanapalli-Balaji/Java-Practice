package Strings;
import java.util.*;

/////////////////////////// Approach 1 ////////////////////
class CountCharactersInString
{
	public static void main1(String[] args)
	{
		String st="Balaji";
		st=st.toLowerCase();

		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

		for(char c:st.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c,0)+1);
		}
		
		for(Character ch:hm.keySet())
		{
				System.out.println(ch+"-->"+hm.get(ch));
		}
	}
}


