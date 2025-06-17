//https://youtu.be/xvNwoz-ufXA?list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz
// leetcode - 560
/*
 Given an array of integers nums and an integer k, 
 return the total number of subarrays whose sum equals to k.

Examples:
Input: nums = [1, 1, 1], k = 2

Output: 2
Explanation: In the given array [1, 1, 1], there are two subarrays 
that sum up to 2: [1, 1] and [1, 1]. Hence, the output is 2.
Input: nums = [1, 2, 3], k = 3

Output: 2
Explanation: In the given array [1, 2, 3], there are two 
subarrays that sum up to 3: [1, 2] and [3]. Hence, the output is 2.
 */
package Sub_Arrays_Problems;

public class Count_Sub_Arrays_With_Given_Sum 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3};
		int k=3;
		///////////////// Brute Force Approach /////////////////////
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
		    int sum=0;
		    for (int j = i; j < arr.length; j++) 
		    {
		        sum+=arr[j];
		        if (sum == k)
		        {
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
}
