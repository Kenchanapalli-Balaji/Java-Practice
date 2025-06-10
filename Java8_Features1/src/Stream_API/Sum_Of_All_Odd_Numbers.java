package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Sum_Of_All_Odd_Numbers 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		// sum of the squares of the odd numbers
		int s=list.stream()
				.filter(n->n%2!=0)            // filter odd numbers
				.map(n->n*n)				  // square each odd number
				.mapToInt(Integer::intValue)  // convert to IntStream
				.sum();						   // sum all squares
		System.out.println(s);
	}
}
