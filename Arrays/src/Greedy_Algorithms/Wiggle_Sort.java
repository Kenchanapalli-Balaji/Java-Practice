//leetcode - 280
/*
 Wiggle Sort is a problem about rearranging an array so that it follows a wiggle pattern.

Given an integer array nums, rearrange it in-place so that:

nums[0] <= nums[1] >= nums[2] <= nums[3] >= nums[4] ...

Meaning:

Every odd index should be greater than or equal to its neighbors.
Every even index should be less than or equal to its neighbors.
Example

Input:
nums = [3,5,2,1,6,4]
Possible output:

[3,5,1,6,2,4]

Check:
3 <= 5 >= 1 <= 6 >= 2 <= 4
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Wiggle_Sort {
	public static void main(String[] args) {
		int[] arr = {3,5,2,1,6,4};
		for(int i=1;i<arr.length;i++)
		{
			if(i%2==1)
			{
				if(arr[i]<arr[i-1])
					swap(arr,i,i-1);
			}
			else
			{
				if(arr[i]>arr[i-1])
					swap(arr,i,i-1);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
