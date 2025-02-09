/*
 PartitioningBy method in java streams is used to partition the elements of a stream into two groups 
 based on the specified predicate. It returns a MAP where the keys are Boolean, and the values are 
 list of elements that satisfy (or do not satisfy) the predicate.
 */
package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy 
{
	public static void main(String[] args) 
	{
		// Partition a list of integers into even and odd numbers
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Map<Boolean, List<Integer>> map=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(map);
	}
}
