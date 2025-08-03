  // leetcode - 80
// https://youtu.be/BLFvXsBf5uM?list=PLjOcsOwEjb12jO6RuyzXRyH2U-vhBu_P0
/*
 Given an integer array nums sorted in non-decreasing order, remove some duplicates 
 in-place such that each unique element appears at most twice. The relative order of the 
 elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must 
instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, 
then the first k elements of nums should hold the final result. It does not matter 
what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the 
input array in-place with O(1) extra memory.
Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements 
of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
package Arrays;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Array_2 
{
	public static void main(String[] args) 
	{
		int[] arr= {0,0,1,1,1,1,2,3,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(removedDuplicates(arr));
		System.out.println(Arrays.toString(arr));
	}
	static int removedDuplicates(int[] arr)
	{
		// first 2 elements no need to check, it might be same or not.
		int count=2;
		for(int i=2;i<arr.length;i++)
		{
			// if (arr[i]==arr[i-2]) means Duplicate elements and appearing more than 2 times;
			if(arr[count-2]!=arr[i])
			{
				 arr[count]=arr[i];
				count++;
			}
		}
		return count;
		
		
		/*
		int i=0;
		for(int n:arr)
		{
			if(i<2 || n!=arr[i-2])
				arr[i++]=n;
		}
		return i;
		*/
	}
}
