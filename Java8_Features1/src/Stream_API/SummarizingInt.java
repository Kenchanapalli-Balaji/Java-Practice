/*
  The SummeizingInt method in java Streams is a Collector that generates summary statistics for the elements
  of a stream , including count, sum, minimum, average and maximum.
  
  Return Type : An IntSummaryStatistics object containing the summary statistics.
 */
package Stream_API;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt 
{
	public static void main(String[] args) 
	{
		// Generate summary statistics (count, sum, min, average, max) for a list of Integers
		List<Integer> list=Arrays.asList(1,2,3,4,5);
	   IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(Integer::intValue));
	   System.out.println(stats);
	   System.out.println(stats.getAverage());
	   System.out.println(stats.getMax());
	}
}
