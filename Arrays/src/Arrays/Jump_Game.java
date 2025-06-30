// leetcode - 55
// https://youtu.be/4bvXUVCzrqI?list=PLjOcsOwEjb12jO6RuyzXRyH2U-vhBu_P0
/*
 You are given an integer array nums. You are initially positioned at 
 the array's first index, and each element in the array represents your 
 maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
package Arrays;

public class Jump_Game 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,1,1,4};
		System.out.println(canJump(arr));
	}
	static boolean canJump(int[] arr)
	{
		int lastpos=arr.length-1;
		for(int i=arr.length-2;i>=0;i--)
		{
			if(i+arr[i]>=lastpos)
				lastpos=i;
		}
		return lastpos==0;
	}
}
