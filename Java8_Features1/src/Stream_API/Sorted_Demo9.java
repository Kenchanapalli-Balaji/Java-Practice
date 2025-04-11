package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Demo9
{
	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(9,8,3,2,1,7,6,5,4);
		
		////////////////// sorted()  ////////////////////
		List<Integer> sortedlist=l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		List<Integer> reversesortedList=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedList);
		
		
		
		Employe e1 = new Employe(1, "Balaji", 29, "sales", 52000);
		Employe e2 = new Employe(2, "Sushanth",11, "sales", 42000);
		Employe e3 = new Employe(3, "Vishnu", 32, "loans", 58000);
		Employe e4 = new Employe(4, "Deekshith", 15, "loans", 35000);
		Employe e5 = new Employe(5, "Samarth", 20, "sales", 58000);
		List<Employe> list= Arrays.asList(e1,e2,e3,e4,e5);
		
		
		List<Employe> sortedList1 = list.stream().sorted(Comparator.comparingInt(s->s.age)).toList();
		System.out.println("Ascending Order Based on Age: ");
		for( Employe c : sortedList1)
		{
			System.out.println(c);
		}
		
		List<Employe> sortedList2 = list.stream()
										.sorted(Comparator.comparingInt(Employe::getAge).reversed()).toList();
		System.out.println("Descending Order Based on Age: ");
		for( Employe c : sortedList2)
		{
			System.out.println(c);
		}
	}
}
