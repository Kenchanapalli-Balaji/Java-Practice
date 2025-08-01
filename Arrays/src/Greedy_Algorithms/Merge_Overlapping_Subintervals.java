// leetcode - 56
// https://youtu.be/2JzRBPFYbKE
//https://youtu.be/IexN60k62jo
/*
 Given an array of intervals where intervals[i] = [starti, endi], merge all 
 overlapping intervals, and return an array of the non-overlapping intervals 
 that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 */
package Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Overlapping_Subintervals 
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
		for(int i[]:arr)
			System.out.print(Arrays.toString(i)+" ");
		int[][] res=merge(arr);
		System.out.println();
		for(int i[]:res)
		System.out.print(Arrays.toString(i)+" ");
	}
	static int[][] merge(int[][] arr)
	{
		List<int[]> list=new ArrayList<int[]>();
		Arrays.sort(arr,(a,b)->a[0]-b[0]);
		
		int start=arr[0][0];
		int end=arr[0][1];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i][0]<=end)
				end=Math.max(end,arr[i][1]);
			else
			{
				list.add(new int[] {start,end});
				start=arr[i][0];
				end=arr[i][1];
			}
		}
		list.add(new int[] {start,end});
		return list.toArray(new int[0][]);
	}
}
