package Important;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class City 
{
	String cityname;
	Integer pincode;
	public City(String cityname, Integer pincode) {
		super();
		this.cityname = cityname;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", pincode=" + pincode + "]";
	}
	
}

class PincodeComparator implements Comparator<City>
{
	@Override
	public int compare(City o1, City o2) 
	{
		return (o1.pincode.compareTo(o2.pincode));
	}	
}

class NameComparator implements Comparator<City>
{
	@Override
	public int compare(City o1, City o2) 
	{
		return (o1.cityname.compareTo(o2.cityname));
	}	
}
public class Comparator_Example 
{
	public static void main(String[] args) 
	{
		List<City> list=new ArrayList<>();
		list.add(new City("Bangalore",560068));
		list.add(new City("Hindupur",515201));
		list.add(new City("Leapakshi",515331));
		list.add(new City("Chilamathur",515301));
		
		PincodeComparator obj1=new PincodeComparator();
		NameComparator obj2=new NameComparator();
		Collections.sort(list, obj1);
		System.out.println("Sorted by Pincode");
		for(City i:list)
		{
			System.out.println(i);
		}
		
		Collections.sort(list, obj2);
		System.out.println("Sorted by City Name");
		for(City j:list)
		{
			System.out.println(j);
		}
		
		
	}
}
