package Stream_API;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Duplicate_Words 
{
	public static void main(String[] args) 
	{
		String s="Big black bug bit a big black dog on his big black nose";
		
		Arrays.stream(s.toLowerCase().split("\\s+"))
		       .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		       .forEach((key,value)->System.out.println(key+"---->"+value));
				
		
		//++++++++++++++++ Using HashMap Method ++++++++++++++++++++++++
		/*
		Map<String, Integer> hm=new HashMap<String, Integer>();
		for(String i:s.split("\\s+"))
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		for(String i:hm.keySet())
		{
			System.out.println(i+"-->"+hm.get(i));
		}
		*/
	}
}
