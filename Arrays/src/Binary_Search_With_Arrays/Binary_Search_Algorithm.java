// leetcode - 704
// https://youtu.be/MHf6awe89xw
/*
 Given an array of integers nums which is sorted in ascending order, 
 and an integer target, write a function to search target in nums. 
 If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */
package Binary_Search_With_Arrays;

public class Binary_Search_Algorithm 
{
	public static void main(String[] args) 
	{
		int[] arr= {-1,0,3,5,9,12}; int target =9;
		
		// Binary Search 
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				System.out.println(mid);
				break;
			}
			else if(target<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		
		// Linear Search
        /*
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
        */
	}
}
