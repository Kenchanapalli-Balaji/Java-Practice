package Stream_API;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo
{
	
	public static void main(String[] args) 
	{
		/*
		 -> In given String print the Non repeated characters in reverse order 
		 	separated by with ",".
		 */
		
		String s="simple codes";
		s.chars().mapToObj(c->(char)c).filter(c->c!=' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey())
				.sorted(Comparator.reverseOrder()).forEach(c->System.out.print(c+", "));
	}
	
}