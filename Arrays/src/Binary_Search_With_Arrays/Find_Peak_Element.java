 // leetcode - 162
// https://youtu.be/cXxmbemS6XM
/*
 A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. 
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, 
an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.


Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */
package Binary_Search_With_Arrays;

public class Find_Peak_Element 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,1};
		System.out.println(findPeakvalue(arr));
		/////////////////////// Brute Force Approach ////////////////////////
		/*
		for(int i=0;i<arr.length;i++)
		{
			if((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1]))
			{
				System.out.println(i);
				break;
			}
		} 
		*/
	}
	/////////////////// Using Binary Search Algorithm //////////////////////
	static int findPeakvalue(int[] arr)
	{
		int n=arr.length;
		if(n==1)
			return 0;
		if(arr[0]>arr[1]) // checking first element in case [10,9,8,7,6,5,4,3,2,1]
			return 0;
		if(arr[n-1]>arr[n-2]) // checking last element in case [1,2,3,4,5,6,7,8,9,10]
			return n-1;
		int low=1;
		int high=n-2;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
				return mid;
			else if(arr[mid]>arr[mid-1]) // Checking if left side array is sorted
				low=mid+1; // eliminating left side array 
			else
				high=mid-1; // eliminating right side array 
		}
		return -1;		
	}
}
