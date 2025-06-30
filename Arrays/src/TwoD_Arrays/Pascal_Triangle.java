// leetcode - 118 
// https://youtu.be/bR7mQgwQ_o8
/*
 Given an integer numRows, return the first numRows of Pascal's triangle.
 In Pascal's triangle, each number is the sum of the two numbers directly
 Example 1:
	1
	1 1
	1 2 1
	1 3 3 1
	1 4 6 4 1
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
// No of Questions from this Topic
// 1 . given Row and Column , we need to find out the element in that place (NCR Formula).
// 2. Print the Nth row of Pascal Triangle (N=5). only 5th row we need to print
// 3. Given N, print the entire Pascal Triangle.
package TwoD_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle 
{
	public static void main(String[] args) 
	{
		// 1) Printing the element in the given place of row and column 
		int row=5; int col=3;
		System.out.println(funNcR(row,col));
		
		
		// 2) Print the Nth row of Pascal triangle
		 int n=5;
		  ////////////////// Brute Force Approach ////////////
		 for (int c = 1; c <= n; c++) 
		 {
	        System.out.print(funNcR(n, c) + " ");
	     }
	      System.out.println();
	      ///////////// Optimal Approach ///////////////////////
	     
	      System.out.println(generateRow(5));
	      
	      
	     // 3) Printing the entire Pascal triangle
	      
	      int N=5;
	      List<List<Integer>> pasclaTriangle = new ArrayList<List<Integer>>();
	      for(int Row=1; Row<=N;Row++)
	      {
	    	  pasclaTriangle.add(generateRow(Row));
	      }
	      System.out.println(pasclaTriangle);	
	}
	static List<Integer> generateRow(int row)
	{
		int ans=1;
		List<Integer> list=new ArrayList<Integer>();
		list.add(1); // inserting the 1st element
		 //calculate the rest of the elements:
		for(int col=1; col<row;col++)
		{
			ans = ans*(row-col);
			ans=ans/col;
			list.add(ans);
		}
		return list;
	}
	static int funNcR(int row, int col)
	{
		// formula is NcR= N!/R! * (N-R)!  == 4c2 = 4*3/2*1= 6;
		int n=row-1;
		int r=col-1;
		int res=1;
		for(int i=0; i<r;i++)
		{
			res=res*(n-i);
			res=res/(i+1);
		}
		return res;
	}
}
