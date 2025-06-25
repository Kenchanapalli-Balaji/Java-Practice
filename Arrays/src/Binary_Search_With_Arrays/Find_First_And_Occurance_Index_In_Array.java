// leetcode - 34 
// https://youtu.be/hjR1IYVx9lY
/*
 Given an array of integers nums sorted in non-decreasing order, 
 find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
package Binary_Search_With_Arrays;

public class Find_First_And_Occurance_Index_In_Array 
{
	public static void main(String[] args) 
	{
		int[] arr={5,7,7,8,8,10};
		int target=8;
		
		// ////////////////// using Linear Search ///////////////
		/*
		int first=-1; int last=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				if(first==-1)
					first=i;
				last=i;
			}
		}
		System.out.println(first+" "+ last);
		*/
	}
}
