package Stream_API;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Non_Repeated_Characters 
{
	public static void main(String[] args) 
	{
		/*
		 -> In given String print the Non repeated characters in reverse order 
		 	separated by with ",".
		 */
		
		String s="simple codes";
		s.chars().mapToObj(c->(char) c).filter(c->c!=' ')
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey)
		.sorted(Comparator.reverseOrder()).forEach(ch->System.out.print(ch+","));
		
	}
}
