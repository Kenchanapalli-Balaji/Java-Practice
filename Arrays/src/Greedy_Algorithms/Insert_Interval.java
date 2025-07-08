// leetcode- 57
// https://youtu.be/xxRE-46OCC8?list=PLgUwDviBIf0rF1w2Koyh78zafB0cz7tea
/*
 You are given an array of non-overlapping intervals intervals where
  intervals[i] = [starti, endi] represent the start and the end of the ith interval 
  and intervals is sorted in ascending order by starti. You are also given an interval 
  newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending
 order by starti and intervals still does not have any overlapping intervals 
 (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a 
new array and return it.

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
 */
package Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_Interval 
{
	public static void main(String[] args) 
	{
		int[][] intervals= {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval= {4,8};
		for(int i[]:intervals)
			System.out.println(Arrays.toString(i));
		
		int res[][]=insert(intervals, newInterval);
		System.out.println("After Insert");
		for(int i[]:res)
			System.out.println(Arrays.toString(i));
	}
	static int[][] insert(int[][] arr, int newInterval[])
	{
		int n=arr.length;
		List<int[]> res=new ArrayList<int[]>();
		int i=0;
		while(i<n && arr[i][1]<newInterval[0])
		{
			res.add(arr[i]); // left segment which are not overlapping
			i++;
		}
		//compare start time of current interval with end time of new interval to 
		//Confirm current two intervals are overlapping each other
		while(i<n && arr[i][0] <= newInterval[1])
		{
		// middle segment which are overlapping and merging them based on min and max values
			newInterval[0]=Math.min(arr[i][0], newInterval[0]);
			newInterval[1]=Math.max(arr[i][1], newInterval[1]);
			i++;
		}
		res.add(newInterval);
		while(i<n)
		{
			res.add(arr[i]); // right segment which are not overlapping after mid segment
			i++;
		}
		return res.toArray(new int[res.size()][]);
	}
}
