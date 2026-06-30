//leetcode - 452
//https://www.youtube.com/watch?v=fvBhjAp0j9c
/*
 There are some spherical balloons taped onto a flat wall that represents the XY-plane. 
 The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] 
 denotes a balloon whose horizontal diameter stretches between xstart and xend. 
 You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points 
along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend.
 There is no limit to the number of arrows that can be shot. 
 A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

Example 1:

Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Minimum_Number_Of_Arrows_To_Burst_Balloons {
	public static void main(String[] args) {
		int[][] arr = {{10,16},{2,8},{1,6},{7,12}};
		Arrays.sort(arr,(a,b)->Integer.compare(a[1], b[1]));
		int count=1;
		int lastEnd=arr[0][1];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i][0]<=lastEnd)
				continue;
			else
			{
				count++;
				lastEnd = arr[i][1];
			}
		}
		System.out.println(count);
	}

}
