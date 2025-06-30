 // leetcode - 88
// https://youtu.be/0H6038ldSyg?list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am
/*
 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be 
stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */
package Arrays;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays
{
	public static void main(String[] args)
	{
		int[] arr1= {1,2,3,0,0,0}; int[] arr2= {2,5,6};
		int n=3; int m=3;
		/////////// Optimal Approach with out creating new array//////////////
		int i=n-1; // last element of index in array 1
		int j=m-1;
		int k=n+m-1; // last position of array1. i.e its pointing to 0's in array1
		while(j>=0)
		{
			if(i>=0 && arr1[i]>arr2[j])
			{
				arr1[k]=arr1[i];
				k--;
				i--;
			}
			else
			{
				arr1[k]=arr2[j];
				j--;
				k--;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		
		
		//////////////////////// Brute Force Approach with extra new Array /////////////////////
		/*
		int ar1[]= {1,3,5,7,9};
		int ar2[]= {2,4,6,8};
		int res[]=new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length&&j<ar2.length)
		{
			if(ar1[i]<ar2[j])
			{
				res[k]=ar1[i];
				i++;
			}
			else
			{
				res[k]=ar2[j];
				j++;
			}
			k++;
		}
		while(i<ar1.length)
		{
			res[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length)
		{
			res[k]=ar2[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println(Arrays.toString(res));
		*/
		
	}
}
