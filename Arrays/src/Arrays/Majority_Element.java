// leetcode - 169
// https://youtu.be/1r8kzrXJiUk?list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am
/*
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
package Arrays;

import java.util.Arrays;

public class Majority_Element 
{
	public static void main(String[] args) 
	{
		int[] arr= {6,5,5};
		
		/////////// Brute Force Approach O(2n) ///////////////
		/*
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
					count++;
			}
			if(count>arr.length/2)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		*/
		
		/////////////// Better Approach ///////////////////
		/*
		 Arrays.sort(arr);
		 System.out.println(arr[arr.length/2]);
		 */
		
		////////////////// Optimal Approach O(1) /////////////////////
		
		int candidate=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
				candidate=arr[i];
			if(candidate==arr[i])
				count++;
			else
				count--;
		}
		System.out.println(candidate);
	}
}
