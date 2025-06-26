// leetcode - 34 
// https://youtu.be/hjR1IYVx9lY
/*
 Given an array of integers nums sorted in non-decreasing order, 
 find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
package Binary_Search_With_Arrays;

import java.util.Arrays;

public class Find_First_And_Occurance_Index_In_Array 
{
	public static void main(String[] args) 
	{
		int[] arr={5,7,7,8,8,10};
		int target=8;
		///////////////// Using Binary Search Algorithm (Optimal Approach) ////////////////////
		int[] res=new int[2];
		res[0]=findFirst(arr,target);
		res[1]=findLast(arr,target);
		System.out.println(Arrays.toString(res));
		
	}
	static int findFirst(int[] arr, int x)
	{
		int low=0;
		int high=arr.length-1;
		int first=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				first=mid;
				high=mid-1;
			}
			else if(arr[mid]<x)
				low=mid+1;
			else
				high=mid-1;	
		}
		return first;
	}
	
	static int findLast(int[] arr, int x)
	{
		int low=0;
		int high=arr.length-1;
		int last=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				last=mid;
				low=mid+1;
			}
			else if(arr[mid]<x)
				low=mid+1;
			else
				high=mid-1;	
		}
		return last;
	}
		
		
		// ////////////////// using Linear Search ///////////////
		/*
		int first=-1; int last=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				if(first==-1)
					first=i;
				last=i;
			}
		}
		System.out.println(first+" "+ last);
		*/
		
}
