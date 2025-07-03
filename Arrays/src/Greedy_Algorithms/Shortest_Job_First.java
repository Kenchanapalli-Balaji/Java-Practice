// https://youtu.be/3-QbX1iDbXs?list=PLgUwDviBIf0rF1w2Koyh78zafB0cz7tea
/*
 A software engineer is tasked with using the shortest job first (SJF) policy to 
 calculate the average waiting time for each process. The shortest job 
 first also known as shortest job next (SJN) scheduling policy selects 
 the waiting process with the least execution time to run next.

Given an array of n integers representing the burst times of processes, 
determine the average waiting time for all processes and return the closest 
whole number that is less than or equal to the result.

Examples:
Input : bt = [4, 1, 3, 7, 2]

Output : 4

Explanation : The total waiting time is 20.

So the average waiting time will be 20/5 => 4.
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Shortest_Job_First 
{
	public static void main(String[] args) 
	{
		int[] arr= {4, 1, 3, 7, 2};
		System.out.println(average(arr));
	}
	static int average(int[] arr)
	{
		Arrays.sort(arr);
		int waitingTime=0;
		int time=0;
		for(int i=0;i<arr.length;i++)
		{
			waitingTime=waitingTime+time;
			time=time+arr[i];
		}
		return waitingTime/arr.length;
	}
}
