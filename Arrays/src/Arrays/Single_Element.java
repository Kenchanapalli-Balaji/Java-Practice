// leetcode 136 
// https://youtu.be/bYWLJb3vCWY
/*
 Given an array of nums of n integers. Every integer in the array appears twice except one integer. 
 Find the number that appeared once in the array.

Examples:
Input : nums = [1, 2, 2, 4, 3, 1, 4]

Output : 3

Explanation : The integer 3 has appeared only once.
 */
package Arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Single_Element 
{
	public static void main(String[] args) 
	{
		int[] arr= {1, 2, 2, 4, 3, 1, 4};
		
		//+++++++++++++++++++++++ Using XOR Method ++++++++++++++++++++++++++
		/*
		 	XOR Operations (if both are same it return s 0 otherwise it returns 1)
		 	0 0 = 0
		 	0 1 = 1
		 	1 0 = 1
		 	1 1 = 0 
		 	Example : 1^1=0; 2^2=0; 1^2=1;
		 */
		int xor=0;
		for(int i=0;i<arr.length;i++)
		{
			xor=xor ^ arr[i];
		}
		System.out.println(xor);
		
		//++++++++++++++++++++++++++ Using Java 8 Feature+++++++++++++++++++++++++
		Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.map(e->e.getKey())
		.forEach(System.out::println);
	}
}
