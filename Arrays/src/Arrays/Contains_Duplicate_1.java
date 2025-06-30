// leetcode - 217
/*
 Given an integer array nums, return true if any value appears at least twice in the array, 
 and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]

Output: true
 */
package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_1 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,1};
		System.out.println(isContains(arr));
	}
	static boolean isContains(int[] arr)
	{
		Set<Integer> set=new HashSet<Integer>();
		for(int i:arr)
		{
			if(set.contains(i))
				return true;
			set.add(i);
		}
		return false;
	}
}
