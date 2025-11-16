//https://youtu.be/frf7qxiN2qU
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
package Sub_Arrays_Problems;
public class Longest_Sub_Array_With_Given_Sum_K 
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
		// ++++++++++++++++++++ Using Sliding Window technique ++++++++++++++++++
		
		int maxlen=0;
		int sum=0;
		int l=0; 
		int r=0;
		while (r < arr.length)
		{
			sum+=arr[r];
			while(sum>n)
			{
				sum-=arr[l];
				l++;
			}
			if(sum==n)
			{
				maxlen=Math.max(maxlen, r-l+1);
			}
			r++;
		}
		System.out.println(maxlen);
					
	}
}
