// leetcode - 435
// https://youtu.be/HDHQ8lAWakY?list=PLgUwDviBIf0rF1w2Koyh78zafB0cz7tea
/*
 Given an array of intervals intervals where intervals[i] = [starti, endi], 
 return the minimum number of intervals you need to remove to make the rest 
 of the intervals non-overlapping.

Note:
===================
that intervals which only touch at a point are non-overlapping. 
For example, [1, 2] and [2, 3] are non-overlapping.

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Non_Overlapping_Intervals 
{
	// please refer N meetings in One Room Problem before going this code 
	public static void main(String[] args) 
	{
		int[][] arr= {{1,2},{2,3},{3,4},{1,3}};
		Arrays.sort(arr,(a,b)->Integer.compare(a[1], b[1]));
		int count=1;
		int lastEnd=arr[0][1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i][0]>=lastEnd)
			{
				count++;
				lastEnd=arr[i][1];
			}
		}
		System.out.println(arr.length-count);
	}
}
