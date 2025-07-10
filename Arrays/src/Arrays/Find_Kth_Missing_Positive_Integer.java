// leetcode 1539
// https://youtu.be/uZ0N_hZpyps
/*
 	Given an array arr of positive integers sorted in a strictly increasing order, 
 	and an integer k.
 	Return the kth positive integer that is missing from this array.
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. 
The 5th missing positive integer is 9.
 */
package Arrays;

public class Find_Kth_Missing_Positive_Integer 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,7,11}; 
		// missing numbers are 1,5,6,8,9,10,. So 5th number is 9.
		int k=5;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<k)
				k++;
			else
				break;
		}
		System.out.println(k);
	}
}
