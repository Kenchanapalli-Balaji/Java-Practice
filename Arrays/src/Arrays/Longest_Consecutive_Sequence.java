// leetcode - 128
// https://youtu.be/oO5uLE7EUlM
/*
 Given an unsorted array of integers nums, return the length of the longest consecutive 
 elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
	Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
	Therefore its length is 4.
	
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */
package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence 
{
	public static void main(String[] args) 
	{
		int[] arr= {100,4,200,1,3,2};
		Set<Integer> set=new HashSet<Integer>();
		for(int i:arr)
			set.add(i);
		System.out.println(set);
	}
}
