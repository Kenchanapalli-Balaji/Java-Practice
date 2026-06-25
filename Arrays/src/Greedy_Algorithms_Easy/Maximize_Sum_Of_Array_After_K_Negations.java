// leetcode - 1005
// https://www.youtube.com/watch?v=kS-Dz79bzBw
/*
 Given an integer array nums and an integer k, modify the array in the following way:

choose an index i and replace nums[i] with -nums[i].
You should apply this process exactly k times. You may choose the same index i multiple times.

Return the largest possible sum of the array after modifying it in this way.
Example 1:

Input: nums = [4,2,3], k = 1
Output: 5
Explanation: Choose index 1 and nums becomes [4,-2,3].
Example 2:

Input: nums = [3,-1,0,2], k = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2]
 */
package Greedy_Algorithms_Easy;

import java.util.Arrays;

public class Maximize_Sum_Of_Array_After_K_Negations {
	public static void main(String[] args) {
		int[] arr = {2,-3,-1,5,-4}; int k= 2;
		int sum=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0 && k>0)
			{
				arr[i] *=-1;
				k--;
			}
		}
		Arrays.sort(arr);
		if(k%2==1)
			arr[0]*=-1;
		for(int i:arr)
			sum+=i;
		System.out.println(sum);
	}

}
