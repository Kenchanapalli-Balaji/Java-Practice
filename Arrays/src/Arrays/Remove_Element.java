// leetcode - 27
// https://youtu.be/QrCds_6NiSk?list=PLjOcsOwEjb12G3uwXNdzyyIs0tNql-2Am
/*
 Given an integer array nums and an integer val, remove all occurrences of val in 
 nums in-place. The order of the elements may be changed. Then return the number 
 of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, 
to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the 
elements which are not equal to val. The remaining elements of nums are not important 
as well as the size of nums.Return k.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
package Arrays;

public class Remove_Element 
{
	public static void main(String[] args) 
	{
		int[] arr= {3,2,2,3};
		int val=3;
		System.out.println(remove(arr, val));
	}
	static int remove(int[] arr, int k)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]!=k)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		return count;
	}
}
