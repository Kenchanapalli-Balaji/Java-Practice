/*
 The Transpose of a matrix is the matrix flipped over its main diagonal , switching
  the matrix's row and columns indicies.
  
  Example 1 : arr={{1,2,3},{4,5,6},{7,8,9}};
  			output: {{1,4,7},{2,5,8},{3,6,9}};
 */
package TwoD_Arrays;

import java.util.Arrays;

public class Transpose_Matrics 
{
	public static void main(String[] args) 
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Orginal Array");
		for(int i[]:arr)
			System.out.println(Arrays.toString(i));
		
		int res[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				res[j][i]=arr[i][j];       // colums as rows and rows as columns
			}
		}
		System.out.println("After Transpose");
		for(int i[]:res)
			System.out.println(Arrays.toString(i));
	}
}
