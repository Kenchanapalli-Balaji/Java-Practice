package Sorting;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Laptop
{
	String name; int ram; int cost; String processor;

	public Laptop(String name, int ram, int cost, String processor) {
		super();
		this.name = name;
		this.ram = ram;
		this.cost = cost;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", cost=" + cost + ", processor=" + processor + "]";
	}
	
}
class PriceComparator1 implements Comparator<Laptop>
{

	@Override
	public int compare(Laptop o1, Laptop o2) 
	{
		
		return ((Integer)o1.cost).compareTo(o2.cost);
	}
	
}
public class Map_Comparator
{
	public static void main(String[] args) 
	{
		PriceComparator1 pc=new PriceComparator1();
		
		Map<Laptop, String> mp=new TreeMap<>(pc);
		mp.put(new Laptop("HP",4,40000,"i5"), "Sushanth");
		mp.put(new Laptop("DELL",8,50000,"i7"), "Bhargav");
		mp.put(new Laptop("LENOVO",12,90000,"i9"), "Balaji");
		mp.put(new Laptop("MI",3,20000,"i3"), "Sravani");
		
		Set<Laptop> s=mp.keySet();
		for(Laptop std:s)
		{
			System.out.println(std+" --->"+mp.get(std));
		}
	}
}
