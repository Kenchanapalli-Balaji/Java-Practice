// https://youtu.be/jtSiWTPLwd0
/*
 Given an integer array nums of size n, sorted in ascending order with distinct values. 
 The array has been right rotated an unknown number of times, 
 between 0 and n-1 (including). Determine the number of rotations performed on the array.

Examples:
Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

Output: 4

Explanation: The original array should be [0, 1, 2, 3, 4, 5, 6, 7]. 
So, we can notice that the array has been rotated 4 times.
 */
package Binary_Search_With_Arrays;

public class Find_Out_How_Many_Times_Array_Rotated 
{
	public static void main(String[] args) 
	{
		int[] arr= {4, 5, 6, 7, 0, 1, 2, 3};
		
		// Algorithm : Find out the minimum value index in array. index is answer.
		
		///////////////// Brute Force Approach using Linear Search ///////////////////
		/*
		int ans=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<ans)
			{
				ans=arr[i];
				index=i;
			}
		}
		System.out.println(index);
		*/
		
		////////////////// Using Binary Search Algorithm (Optimal Apparoach)////////////
		
		int low=0; int high=arr.length-1;
		int min=Integer.MAX_VALUE;
		int index=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			// Identifying the sorted array side either left side or right side
			if(arr[low]<=arr[mid]) // if left side array is sorted
			{
				if(arr[low]<min)
				{
					index=low;
					min=arr[low];
				}
	// once we take 1st element from sorted array no need to check other elements in sorted array
				low=mid+1;  // Eliminate left half:
			}
			else
			{
				if(arr[mid]<min)
				{
					index=mid;
					min=arr[mid];
				}
				high=mid-1;  // Eliminate right half:
			}
		}
		System.out.println(index);
	}
	
}
