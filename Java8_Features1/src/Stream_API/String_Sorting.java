package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_Sorting 
{
	public static void main(String[] args) 
	{
		String s="balaji";
		// Sorting the String in Ascending Order
	 	String s2=s.chars() // Get an IntStream of character codes
	 				.mapToObj(c->(char)c) // Convert IntStream to Stream<Character>
	 				.sorted() // Sort characters in natural order (alphabetical)
	 				.map(String::valueOf) // Convert Character back to String
	 				.collect(Collectors.joining());	// Join characters into a single string
	 	System.out.println(s2);
	 	
	 	
	 	// Sorting the String in Descending Order
	 	String s3=s.chars().mapToObj(c->(char)c)
	 			.sorted(Comparator.reverseOrder())
	 			.map(String::valueOf)
	 			.collect(Collectors.joining());
	 	System.out.println(s3);
	 	
	 	// Sorting the multiple Strings based on their length in ascending Order
	 	
	 	List<String> list=Arrays.asList("Apple","Bat","Cat","Doll","Elephant","Frog");
	 List<String> sortedList=list.stream()
			 .sorted(Comparator.comparing(String::length))
			 .collect(Collectors.toList());
	 System.out.println(sortedList);
		
	}
}
