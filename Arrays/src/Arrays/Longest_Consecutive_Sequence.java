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
		int count=0;
		int longest=0;
		int last_smaller=Integer.MIN_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-1==last_smaller)
			{
				count++;
				last_smaller=arr[i];
			}
			else if(arr[i]-1!=last_smaller)
			{
				count=1;
				last_smaller=arr[i];
			}
			longest=Math.max(longest, count);
		}
		System.out.println(longest);
	}
}
