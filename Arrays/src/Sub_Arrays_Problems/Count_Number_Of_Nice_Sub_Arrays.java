// leetcode - 1248
// https://youtu.be/j_QOv9OT9Og
/*
 Given an array of integers nums and an integer k. A continuous subarray 
 is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
 */
package Sub_Arrays_Problems;

public class Count_Number_Of_Nice_Sub_Arrays 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,1,2,1,1};
		int k=3;
		System.out.println(sum(arr ,k) - sum(arr , k-1));
		 
	}
	// Before this problem please see the Binary_Sub_Arrays_With_Sum Problem for reference
	////////////////////////Sliding Window Technique ////////////////////////
	// we assume given array like Binary numbers -> {1,1,0,1,1}
	// even numbers as 0 and odd numbers as 1.
	static int sum(int[] arr, int k)
	{
		int l=0;
		int r=0;
		int count=0;
		int sum=0;
		while(r<arr.length)
		{
			sum+=arr[r]%2;
			while(sum>k)
			{
				sum-=arr[l]%2;
				l++;
			}
			count+=r-l+1;
			r++;
		}
		return count;
	}
}
