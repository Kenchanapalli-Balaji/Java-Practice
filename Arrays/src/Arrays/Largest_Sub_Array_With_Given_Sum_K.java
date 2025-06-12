//https://youtu.be/frf7qxiN2qU
package Arrays;
/*
 Given an array nums of size n and an integer k, find the length of the 
 longest sub-array that sums to k. If no such sub-array exists, return 0.


Examples:
Input: nums = [10, 5, 2, 7, 1, 9],  k=15

Output: 4

Explanation: The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], 
which has a length of 4. This sub-array starts at index 1 and ends at index 4, 
and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array 
is 4.
 */
public class Largest_Sub_Array_With_Given_Sum_K 
{
	public static void main(String[] args) 
	{
		int arr[]={10, 5, 2, 7, 1, 9};
		int n=15;
		
		// ++++++++++++++++++++++ Brute Force Approach +++++++++++++++++++++
		/*
		int maxlen=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
				}
				if(sum==n)
					len = Math.max(len, j-i+1);	
			}	
		}
		*/
		
		
		// ++++++++++++++++++++++ Second Method +++++++++++++++++++++++
				/*
				int maxlen=0;
				for(int i=0;i<arr.length;i++)
				{
					int sum=0;
					for(int j=i;j<arr.length;j++)
					{
						sum=sum+arr[j];
						if(sum==n)
							maxlen=Math.max(maxlen, j-i+1);
					}
				}
				System.out.println(maxlen);
				*/
		// ++++++++++++++++++++ Optimize Solution Using 2 Pointers ++++++++++++++++++
		
		int maxlen=0;
		int sum=arr[0];
		int left=0; 
		int right=0;
		while (right < arr.length)
		{
			// if sum > n, reduce the subarray from left
			// until sum becomes less or equal to n:
			while (left <= right && sum > n)
			{
				sum=sum-arr[left];
				left++;
			}
			// if sum = n, update the maxLen i.e. answer:
			if(sum==n)
			maxlen= Math.max(maxlen, right-left+1);
			// Move forward thw right pointer:
			right++;
			if(right<arr.length)
			sum=sum+arr[right];
		}
		System.out.println(maxlen);		
				
	}
}
