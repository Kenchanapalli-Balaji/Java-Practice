package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_Maximum_Repeated_Number 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,1,2,3,3,3);
		Integer maximumrepeatedNumber = list.stream()
				.collect(Collectors.groupingBy(n->n,Collectors.counting()))
				.entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue))
				//.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);
		System.out.println(maximumrepeatedNumber);
	}
	
}
