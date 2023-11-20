package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> indmap=new HashMap<>();
		indmap.put(7,"Dhoni");
		indmap.put(8,"Virat");
		indmap.put(10,"Rohit");
		Map<Integer, String> ausmap=new HashMap<>();
		ausmap.put(1,"Smith");
		ausmap.put(22,"Warner");
		ausmap.put(2,"Maxwell");
		
		Map<Integer,String> iplmap=new HashMap<>();
		iplmap.putAll(indmap);
		iplmap.putAll(ausmap);
		System.out.println(iplmap);
		System.out.println(iplmap.size());
		System.out.println(iplmap.isEmpty());
		iplmap.remove(22);
		System.out.println(iplmap.containsKey(1));
		System.out.println(iplmap.get(8));
		System.out.println(iplmap);
		
	}
}
