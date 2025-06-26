// leetcode - 81
// https://youtu.be/w2G2W8l__pc
/*
 There is an integer array nums sorted in non-decreasing order 
 (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot 
index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 
and become [4,5,6,6,7,0,1,2,4,4].
Given the array nums after the rotation and an integer target, 
return true if target is in nums, or false if it is not in nums.
You must decrease the overall operation steps as much as possible.

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
 */
package Binary_Search_With_Arrays;

public class Search_In_Rotated_Sorted_Array_2 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,5,6,0,0,1,2}; // with Duplicate Elements(Not Unique)
		int target = 0;
		boolean isPresent=false;
		
		//////////////////////// Using Binary Search Algorithm //////////////////////
		
		int low=0; int high =arr.length-1; 
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target)
			{
				isPresent=true;
				break;
			}
			if(arr[mid]==arr[low] && arr[mid]==arr[high])
			{
				low++;
				high--;
				continue;
			}
			
		 // identifying the sorted array side either left or right
			if(arr[low]<=arr[mid]) // if left side sorted array
			{
				if(arr[low]<=target && target <= arr[mid])
					high=mid-1;
				else 
					low=mid+1;
			}
			else // if right side sorted array	
			{
				if(arr[mid] <= target && target <=arr[high])
					low=mid+1;
				else
					high=mid-1;
			}
		}
		System.out.println(isPresent);
	}
}
