package Sorting;

import java.util.Set;
import java.util.TreeSet;

class City implements Comparable<City>
{
	String name;
	int pincode;
	
	public City(String name, int pincode) {
		super();
		this.name = name;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(City o) 
	{
	//	return -((Integer)this.pincode).compareTo(o.pincode); // Descending Order
	//return ((Integer)this.pincode).compareTo(o.pincode); //Ascending Order
		return this.name.compareToIgnoreCase(o.name)*-1; //Comparing Based On City name
		
	}
	
}
public class Set_Comparable 
{
	public static void main(String[] args) 
	{
		Set<City> ts=new TreeSet<>();
		ts.add(new City("Bangalore",560068));
		ts.add(new City("Leapakshi",515331));
		ts.add(new City("Hindupur",515201));
		ts.add(new City("Chilamathur",515301));
		
		for(City c:ts)
			System.out.println(c);
		
	}
}
