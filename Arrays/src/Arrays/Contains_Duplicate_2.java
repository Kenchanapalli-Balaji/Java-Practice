// leetcode - 219
// https://youtu.be/tp4JivY1-Mk?list=PLjOcsOwEjb12jO6RuyzXRyH2U-vhBu_P0
/*
 Given an integer array nums and an integer k, return true if there are two 
  distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
 */
package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_2
{
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,3}; int k=2;
		System.out.println(isContains(arr,k));
	}
	static boolean isContains(int[] arr, int k)
	{
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				if(Math.abs(i-hm.get(arr[i]))<=k) // subtracting previous index with current index
					return true;
			}
			hm.put(arr[i], i);  // storing index as value 
		}
		return false;
	}
}