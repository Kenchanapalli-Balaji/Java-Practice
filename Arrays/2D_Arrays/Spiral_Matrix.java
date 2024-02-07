//https://youtu.be/v63dUJXHqcM
// leet code - 54
/*
 Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]


Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 
 */
package testing;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix 
{
	public static void main(String[] args) 
	{
		int mat[][]= {{1,2,3},
					  {4,5,6},
					  {7,8,9}};
		
		int top=0; int bottom=mat.length-1;
		int left=0; int right=mat[0].length-1;
		List<Integer> list=new ArrayList<>();
		while(top<=bottom && left<=right)
		{
			for(int i=left;i<=right;i++)
			{
				list.add(mat[top][i]);
			}
			top++;
			
			for(int i=top;i<=bottom;i++)
			{
				list.add(mat[i][right]);
			}
			right--;
			
			if(!(top<=bottom && left<=right))
				break;
			
			for(int i=right;i>=left;i--)
			{
				list.add(mat[bottom][i]);
			}
			bottom--;
			
			for(int i=bottom;i>=top;i--)
			{
				list.add(mat[i][left]);
			}
			left++;
		}
		System.out.println(list);
		
		
	}
}
