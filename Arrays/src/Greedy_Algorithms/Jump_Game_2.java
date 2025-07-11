// leetcode - 45 
// https://youtu.be/BRnRPLNGWIo
/*
 You are given a 0-indexed array of integers nums of length n. You are initially
  positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. 
In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. 
The test cases are generated such that you can reach nums[n - 1].

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step 
from index 0 to 1, then 3 steps to the last index.
 */
package Greedy_Algorithms;

public class Jump_Game_2 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,1,1,4};
		int farthest=0;
		int end=0;
		int jump=0;
		for(int i=0;i<arr.length-1;i++)
		{
			// Update the farthest reachable index from current position
			farthest=Math.max(farthest, i+arr[i]);
			// When we reach the end of the current jump range,
            // we must make another jump
			if(i==end)
			{
				jump++;
				end=farthest;
			}
		}
		System.out.println(jump);
		System.out.println(farthest);
	}
}
