 // leetcode - 153
// 	https://youtu.be/nhEMDKMB44g
/*
 Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
 For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results 
in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, 
return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
package Binary_Search_With_Arrays;

public class Find_Minimum_In_Rotated_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int[] arr= {3,4,5,1,2};
		
		//////////////// Using Binary Search Algorighm /////////////////////
		
		int low=0; int high=arr.length-1;
		int min=Integer.MAX_VALUE;
		while(low<=high)
		{	
			int mid=(low+high)/2;
			// Identifying the sorted array side either left side or right side
			if(arr[low]<=arr[mid]) // if left side array is sorted
			{
				min=Math.min(min, arr[low]); 
	// once we take 1st element from sorted array no need to check other elements in sorted array
				low=mid+1;
			}
			else // if right side array is sorted
			{
				min =Math.min(min, arr[mid]);
				high=mid-1;
			}
		}
		System.out.println(min);
	}
}
