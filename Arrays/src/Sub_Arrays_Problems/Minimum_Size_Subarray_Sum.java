// leetcode - 209
// https://youtu.be/1FR7rZ7aJfs?list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am
/*
 Given an array of positive integers nums and a positive integer target, 
 return the minimal length of a subarray whose sum is greater than or equal to target. 
 If there is no such subarray, return 0 instead.
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */
package Sub_Arrays_Problems;

public class Minimum_Size_Subarray_Sum 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,1,2,4,3};
		int target=7;
		System.out.println(fun(arr, 7));
	}
	//////////////////////Brute Force Approach O(n2) /////////////////
		/*
		static int fun(int[] arr, int target)
		{
			int minLength = Integer.MAX_VALUE;
		
			for (int i = 0; i < arr.length; i++) 
			{
				int sum = 0;
				for (int j = i; j <arr.length; j++) 
				{
					sum += arr[j];
					if (sum >= target) 
					{
		 				minLength = Math.min(minLength, j - i + 1);
		 				break; // stop extending since we found valid subarray from i
					}
				}
			}
			return minLength;
		}
		*/
	////////////// Using Sliding window technique ///////////////////
	static int fun(int[] arr, int target)
	{
		int minLength=Integer.MAX_VALUE;
		int start=0;
		int end=0;
		int sum=0;
		for(end=0;end<arr.length;end++)
		{
			sum+=arr[end];
			while(sum>=target)
			{
				minLength=Math.min(minLength,end-start+1);
				sum=sum-arr[start];
				start++;
			}	
		}
		if(minLength==Integer.MAX_VALUE)
			return 0;
		else 
			return minLength;
	}
	
}
