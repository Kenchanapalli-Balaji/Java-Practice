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
	}
}
