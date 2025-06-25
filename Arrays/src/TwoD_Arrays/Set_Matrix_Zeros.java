// leetcode - 73
// https://youtu.be/N0MgLvceX7M
/*
 Given an m x n integer matrix matrix, if an element is 0, 
 set its entire row and column to 0's.
 
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
 */
package TwoD_Arrays;

import java.util.Arrays;

public class Set_Matrix_Zeros 
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
		System.out.println("Original Array");
		
		//////////// Printing the array //////////////
		for(int i[]:arr)
			System.out.println(Arrays.toString(i));
		
		/////////////////////////////// Brute Force Approach 1 ///////////////////////////
		
		/*
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==0)
				{
					markRow(arr,i);
					markCol(arr,j);
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==-1)
					arr[i][j]=0;
			}
		}
		
		static void markRow(int[][] arr,int i)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]!=0)
					arr[i][j]=-1;
			}
		}
		static void markCol(int[][] arr, int j)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i][j]!=0)
					arr[i][j]=-1;
			}
		}
		
		*/
		
		
		////////////////// Better Approach 2 /////////////////////////
		
		 int n= arr.length;
		 int m= arr[0].length;
		 int[] row=new int[n];
		 int[] col=new int[m];
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 if(arr[i][j]==0)
				 {
					// mark ith index of row wih 1:
					 row[i]=1;
					// mark jth index of col wih 1:
					 col[j]=1;
				 }
			 }
		 }
		 // Finally, mark all (i, j) as 0
	     // if row[i] or col[j] is marked with 1.
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 if(row[i]==1 || col[j]==1)
					 arr[i][j]=0;
			 }
		 }
		 
		
			//////////// Printing the array //////////////
			 System.out.println("After altering ");
			 for(int i[]:arr)
					System.out.println(Arrays.toString(i));
	}
	
	
}
