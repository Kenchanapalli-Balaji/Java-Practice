// leetcode - 324
/*
 Given an integer array nums, rearrange it in-place so that:

nums[0] < nums[1] > nums[2] < nums[3] > nums[4] ...
Difference from 280:

LeetCode 280:
<= >= <= >=
LeetCode 324:
<  > <  > 
The elements must strictly alternate.
Example
Input:
nums = [1,5,1,1,6,4]

Output:

[1,6,1,5,1,4]

Check:
1 < 6 > 1 < 5 > 1 < 4
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Wiggle_Sort_II {
	public static void main(String[] args) {
		int[] arr= {1,5,1,1,6,4};
		int n=arr.length-1;
		int[] newArr=Arrays.copyOf(arr, arr.length);
		Arrays.sort(newArr);
		for(int i=1;i<arr.length;i+=2)
			arr[i]=newArr[n--];
		for(int i=0;i<arr.length;i+=2)
			arr[i]=newArr[n--];
		System.out.println(Arrays.toString(arr));
		
		
	}

}
