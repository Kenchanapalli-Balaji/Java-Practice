// leetcode - 992
// https://youtu.be/7wYGbV_LsX4
/*
 Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.

Example 1:

Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers:
[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
 */
package Sub_Arrays_Problems;

import java.util.*;

public class SubArrays_With_K_Different_Integers 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,1,2,3};
		int k=2;
		System.out.println(fun(arr, k)-fun(arr,k-1)); 
		// count total sub arrays with <=k and <=k-1 after that subtract from,we will get exact==k 
	}
	/////////////////////// Brute Force Approach /////////////////////////
	/*
	static int fun(int[] arr, int k)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			Set<Integer> set=new HashSet<Integer>();
			for(int j=i;j<arr.length;j++)
			{
				set.add(arr[j]);
				if(set.size()==k)
					count++;
				else if(set.size()>k)
					break;
			}
		}
		return count;
	}
	*/
	////////////////// Sliding Window Approach /////////////////
	static int fun(int[] arr, int k)
	{
		int count=0;
		int l=0;
		int r=0;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		while(r<arr.length)
		{
			map.put(arr[r], map.getOrDefault(arr[r], 0)+1);
			// decreasing map size from left side to right side
			while(map.size()>k)
			{
				map.put(arr[l], map.get(arr[l])-1);
				if(map.get(arr[l])==0)
					map.remove(arr[l]);
				l++;
			}
			count+=r-l+1;
			r++;
		}
		return count;
	}
}
