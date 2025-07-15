// leetcode - 1004
/*
 Given a binary array nums and an integer k, return the maximum number of 
 consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */
package Arrays;

public class Max_Consecutive_Ones_3 
{
	public static void main(String[] args) 
	{
		int[] arr= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		int max=0;
		
		//////////////////////// Brute Force Approach //////////////
		/*
		for(int i=0;i<arr.length;i++)
		{
			int zeros=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==0)
					zeros++;
				if(zeros<=k)
				{
					max=Math.max(max, j-i+1);
				}
			}
		}
		System.out.println(max);
		*/
		
		/////////////////////// Sliding Window technique /////////////////////////
		
		int left=0; int right=0;
		int zeros=0;
		while(right<arr.length)
		{
			if(arr[right]==0)
				zeros++;
			// if count of zeros greater than given k,moving left and decreasing zeros
			while(zeros>k) 
			{
				if(arr[left]==0)
					zeros--;
				left++;
			}
			if(zeros<=k)
			{
				max=Math.max(max, right-left+1);
				right++;
			}
		}
		System.out.println(max);
	}
}
