// leetcode - 74
// https://youtu.be/JXU4Akft7yk
/*
 You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.

 Example 1 :
 Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 Output: true
 */
package Binary_Search_With_Arrays;

public class Search_In_2D_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=30;
		System.out.println(search(arr,target));
	}
	//////////////////// Brute Force Approach ////////////////////////
	/*
	static boolean search(int[][] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==k)
					return true;
			}
		}
		return false;
	}
	*/
	/////////////////////////// Optimal Approach /////////////////////////
	static boolean search(int[][] arr, int k)
	{
		int n=arr.length;
		int m=arr[0].length;
		int low=0;
		int high=n*m-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			// conversion of 1D array to 2D Array (1,1)
			int row=mid/m; 
			int col=mid%m;
			if(arr[row][col]==k)
				return true;
			else if(arr[row][col]<k)
				low=mid+1;
			else
				high=mid-1;
		}
		return false;
	}
	
}
