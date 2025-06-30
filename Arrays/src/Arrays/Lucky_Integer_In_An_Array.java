// leetcode - 1394
// 
/*
 Given an array of integers arr, a lucky integer is an integer that has 
 a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
 */
package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Lucky_Integer_In_An_Array 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,2,3,3,3};
		
		//////////////////// Using HashMap ////////////////////
		int max=0;
		Map<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int i:arr)
		{
			hm.put(i, hm.getOrDefault(i,0)+1);
		}
		for(int i:hm.keySet())
		{
			if(i==hm.get(i))
				max=Math.max(max, i);
		}
		System.out.println(max);
	}
}
