// leetcode - 75
// https://youtu.be/tp8JIuCXBaU
/*
 Given an array nums with n objects colored red, white, or blue, sort them in-place 
 so that objects of the same color are adjacent, with the colors in the order red, white, 
 and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
package Arrays;

import java.util.Arrays;

public class Sort_An_Array_Of_0s_1s_And_2s 
{
	public static void main(String[] args) 
	{
		int[] arr= {0,1,2,0,1,2};
		System.out.println(Arrays.toString(arr));
		// Dutch National Flag Algorithm
/*
 The dutch national flag algorithm involves sorting the nums array by partitioning it into 
 3 segments.
 nums[0]...nums[low - 1] : This part should consist of all zeroes.
 nums[low]...nums[mid - 1] : This part should consist of all ones.
 nums[mid]...nums[end of array] : This part should consist of all twos
*/
		
		int low=0; int mid=0; int high=arr.length-1;
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				mid++;
				low++;
			}
			else if(arr[mid]==1)
				mid++;
			else // if arr[mid]==2 
			{
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
