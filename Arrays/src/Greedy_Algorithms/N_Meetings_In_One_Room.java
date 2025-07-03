// https://youtu.be/mKfhTotEguk?list=PLgUwDviBIf0rF1w2Koyh78zafB0cz7tea
/*
 You are given timings of n meetings in the form of (start[i], end[i]) where 
 start[i] is the start time of meeting i and end[i] is the finish time of meeting i. 
 Return the maximum number of meetings that can be accommodated in a single meeting room, 
 when only one meeting can be held in the meeting room at a particular time. 

Note:
=============
 The start time of one chosen meeting can't be equal to the end time of the 
 other chosen meeting. i.e (second meeting start time should be greater than 
 first meeting end time. it should not be equal).

Examples :
Input: start[] = [1, 3, 0, 5, 8, 5], end[] =  [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: Maximum four meetings can be held with given start and end timings. 
The meetings are - (1, 2), (3, 4), (5,7) and (8,9)
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class N_Meetings_In_One_Room 
{
	public static void main(String[] args) 
	{
		int[] start= {1, 3, 0, 5, 8, 5};
		int[] end= {2, 4, 6, 7, 9, 9};
		System.out.println("Maximum meetings can conduct :"+maximumMeetings(start,end));
	}

	static int maximumMeetings(int[] start, int[] end) 
	{
		int n=start.length; // get the number of meetings from the input arrays
		// create a list of meetings (start,end)
		int[][] meetings=new int[n][2];
		for(int i=0;i<n;i++)
		{
			meetings[i][0]=start[i]; // in i'th row first value is start time
			meetings[i][1]=end[i];   // in i'th row second value is end time
		}
		
		// Sort meetings by end time (earliest time).
		// Bcz we can calculate one by one meeting after each completed early
		Arrays.sort(meetings,(a,b)->Integer.compare(a[1], b[1]));
		
		int count=1; // since first meeting always start, so we have taken as 1
		int currentEnd=meetings[0][1]; // first meeting end time. i.e smallest one in end array
		for(int i=1;i<n;i++)
		{
			if(meetings[i][0]>currentEnd) // second meeting start time should be greater than first meeting end time
			{
				count++;
				currentEnd=meetings[i][1];
			}
		}
		
		return count;
	}
}
