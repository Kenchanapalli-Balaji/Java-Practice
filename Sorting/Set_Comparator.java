package Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Pen 
{
	String name; int price;String clr;
	
	public Pen(String name, int price, String clr) 
	{
		this.name = name;
		this.price = price;
		this.clr = clr;
	}

	@Override
	public String toString() {
		return "Pen [name=" + name + ", price=" + price + ", clr=" + clr + "]";
	}
}
class PriceComparator implements Comparator<Pen>
{

	@Override
	public int compare(Pen o1, Pen o2) 
	{
		return ((Integer)o1.price).compareTo(o2.price);
	}
	
}
class ColourComparator implements Comparator<Pen>
{

	@Override
	public int compare(Pen o1, Pen o2) 
	{
		return o1.clr.compareTo(o2.clr);
	}
	
}
public class Set_Comparator 
{
	public static void main(String[] args) 
	{
		PriceComparator pc=new PriceComparator();
		ColourComparator cc=new ColourComparator();
		Set<Pen> set=new TreeSet<>(pc);
		set.add(new Pen("Reynolds",20,"Blue"));
		set.add(new Pen("Santoor",5,"Black"));
		set.add(new Pen("Cello",10,"Red"));
		set.add(new Pen("Alembic",40,"Green"));
		System.out.println("Sorting By Price of the Pen---------------");
		for(Pen p:set)
		{
			System.out.println(p);
		}
		
	}
}
