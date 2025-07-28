/*
 Given a 0-indexed m x n integer matrix matrix, create a new 0-indexed matrix called answer. 
  Make answer equal to matrix, then replace each element with the value -1 with the maximum element 
  in its respective column.
Input: matrix = [[1,2,-1],[4,-1,6],[7,8,9]]
Output: [[1,2,9],[4,8,6],[7,8,9]]
Explanation: The diagram above shows the elements that are changed (in blue).
- We replace the value in the cell [1][1] with the maximum value in the column 1, that is 8.
- We replace the value in the cell [0][2] with the maximum value in the column 2, that is 9.
 */
package TwoD_Arrays;

import java.util.Arrays;
public class Modify_The_Matrix 
{
	
	public static void main(String[] args) 
	{
		int arr[][]= {  {1,2,-1},
						{4,-1,6},
						{7,8,9}
					 };
		
		int res[][]=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				res[i][j]=arr[i][j];
				if(arr[i][j]==-1)
				{
					int maxcol=0;
					for(int k=0;k<arr.length;k++)
					{
						if(arr[k][j]>maxcol)
							maxcol=arr[k][j];
					}
					res[i][j]=maxcol;
				}
			}
		}
		for(int a[]:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		System.out.println("After Modifying the array");
		for(int a[]:res)
		{
			System.out.println(Arrays.toString(a));
		}
	}
}
