package Stream_API;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo
{
	
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		IntSummaryStatistics stats=list.stream()
				.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(stats.getSum());
		
	}
	
}