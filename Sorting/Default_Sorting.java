package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Default_Sorting 
{
	public static void main(String[] args) 
	{
		String ar[]= {"Balaji","Vishnu","Deekshith","Nandeesh","Sushanth"};
		Arrays.sort(ar);//only for Array It will use
		System.out.println(Arrays.toString(ar));
		
		//List Interface like ArrayList, LinkedList,Vector
		List<String> names=new ArrayList<>();
		names.add("Balaji");
		names.add("Vishnu");
		names.add("Deekshith");
		names.add("Nandeesh");
		names.add("Sushanth");
		System.out.println(names);//Before Sorting
		Collections.sort(names);//  Ascending Order Only For List But Not for Set
		System.out.println(names);
		Collections.sort(names,Collections.reverseOrder());//For Descending Order
		System.out.println(names);
		
		
		// Set Interface Like HashSet, LinkedHashSet, TreeSet
		//Set<String> names1=new TreeSet<>(); //By default Automatically It will give ascending Order
		Set<String> names1=new TreeSet<>(Collections.reverseOrder());//For Descending Order
		names1.add("Balaji");
		names1.add("Vishnu");
		names1.add("Deekshith");
		names1.add("Nandeesh");
		names1.add("Sushanth");
		System.out.println(names1);
		
		
		//Map<String , Integer> names2=new TreeMap<>();//By default Automatically It will give ascending Order
		Map<String , Integer> names2=new TreeMap<>(Collections.reverseOrder());//For Descending Order
		names2.put("Balaji",25);
		names2.put("Vishnu",3);
		names2.put("Deekshith",2);
		names2.put("Nandeesh",10);
		names2.put("Sushanth",8);
		System.out.println(names2);//Sorting is happen based on Keys not values
	}
}
