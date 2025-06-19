package Strings;
import java.util.*;

/////////////////////////// Approach 1 ////////////////////
class CountCharactersInString
{
	public static void main1(String[] args)
	{
		String st="Balaji Kallur";
		st=st.toLowerCase();

		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

		char[] chars=st.toCharArray();
		System.out.println(chars.toString());
		
		for(Character ch:chars)
		{
			if(hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			
			else if(ch!=' ')//to avoid  white spaces
				hm.put(ch,1);
		}
		
		for(Character ch:hm.keySet())
		{
				System.out.println(ch+"-->"+hm.get(ch));
		}
	}
}


