package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Iterating_Map 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> indmap=new HashMap<>();
		indmap.put(7,"Dhoni");
		indmap.put(8,"Virat");
		indmap.put(10,"Rohith");
		System.out.println(indmap);
		System.out.println("Iterating Map using entrySet()");

		Set<Entry<Integer,String>> set=indmap.entrySet();
		for(Entry<Integer,String> entry:set)
		{
			Integer key=entry.getKey();
			String val=entry.getValue();
			System.out.println(key+" ="+val);
		}

		System.out.println("iterating Map using keySet()");
		Set<Integer> s=indmap.keySet();
		for(Integer i:s)
		{
			System.out.println("Key ="+i+" and value is : "+indmap.get(i));
		}
		
		System.out.println("iterating Map using values()");
		Collection<String> c=indmap.values();
		for(String s1:c)
		{
			System.out.println("values ="+s1);
		}
	}
}
