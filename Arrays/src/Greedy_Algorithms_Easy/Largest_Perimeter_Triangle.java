//leetcode - 976
// https://www.youtube.com/watch?v=3nFdmntsNLs
/*
 Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, 
 formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

Example 1:

Input: nums = [2,1,2]
Output: 5
Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
Example 2:

Input: nums = [1,2,1,10]
Output: 0
Explanation: 
You cannot use the side lengths 1, 1, and 2 to form a triangle.
You cannot use the side lengths 1, 1, and 10 to form a triangle.
You cannot use the side lengths 1, 2, and 10 to form a triangle.
As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.
 
 */
package Greedy_Algorithms_Easy;

import java.util.Arrays;

public class Largest_Perimeter_Triangle {
	public static void main(String[] args) {
		int[] arr = {2,1,2};
		System.out.println(max(arr));
	}
	static int max(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=2;i--)
		{
			if(arr[i-1] + arr[i-2] > arr[i])
				return arr[i-1] + arr[i-2] + arr[i];
		}
		return 0;
	}

}
