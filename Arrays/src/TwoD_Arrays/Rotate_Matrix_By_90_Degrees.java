// leetcode -48 
// https://youtu.be/Z0R2u6gd3GU
/*
 You are given an n x n 2D matrix representing an image, rotate the 
 image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the 
input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
package TwoD_Arrays;

import java.util.Arrays;

public class Rotate_Matrix_By_90_Degrees 
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Orginal Array");
		for(int i[]:arr)
			System.out.println(Arrays.toString(i));
		
		///////////////////// Brute Force Approach 1 with new Array ///////////////////
		/*
		int[][] res=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				res[j][arr.length-1-i]=arr[i][j];
			}
		}
		*/
		
		
		///////////////// Optimal Approach without creating new Array /////////////////
		
		// Transpose  // columns as rows and rows as columns
		 for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i;j<arr[i].length;j++)
	            {
	                int temp=arr[i][j];
	               arr[i][j]=arr[j][i];
	                arr[j][i]=temp;
	            }
	        }
		 
		 // Reverse
		 for(int i=0;i<arr.length;i++)
		 {
			 int start=0;
			 int end=arr[0].length-1;
			 while(start<end)
			 {
				 int temp=arr[i][start];
				 arr[i][start]=arr[i][end];
				 arr[i][end]=temp;
				 start++;
				 end--;
			 }
		 }
		 System.out.println("After Rotating Array by 90 Degrees");
		for(int i[]:arr)
			System.out.println(Arrays.toString(i));
		
		
	}
}
