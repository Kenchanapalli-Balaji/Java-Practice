/*
 *Matrix multiplication Rules
From the above defined formula and procedure, we can write the following rules and properties for matrix multiplication.

The product of two matrices A and B is defined if the number of columns of A is equal to the number of rows of B.
If AB is defined, then BA need not be defined
If both A and B are square matrices of the same order, then both AB and BA are defined.
If AB and BA are both defined, it is not necessary that AB = BA.
If the product of two matrices is a zero matrix, it is not necessary that one of the matrices is a zero matrix.
------------------------------------------------------------------------------------------------------------
2×2 Matrix Multiplication :- 
Let’s consider a simple 2 × 2 matrix multiplication
		3 7		6 2
  a=	4 9   b=5 8
Now each of the elements of product matrix AB can be calculated as follows:

AB11 = 3 × 6 + 7 ×5 = 53
AB12 = 3 × 2 + 7 × 8 = 62
AB21 = 4 × 6 + 9 × 5 = 69
AB22 = 4 × 2 + 9 × 8 = 80
Therefore,
	53 62
res=69 80
----------------------------------------------------------------------------------------------------

 3×3 Matrix Multiplication:- 
To understand the multiplication of two 3 × 3 matrices, let us consider two 3 × 3 matrices A and B.
		12 8 4		5 19 3
 		3 17 14		6 15 9
 A=		9 8 10    B=7 8 16
 
Each element of the Product matrix AB can be calculated as follows:

AB11 = 12×5 + 8×6 + 4×7 = 136
AB12 = 12×19 + 8×15 + 4×8 = 380
AB13 = 12×3 + 8×9+4×16 = 172
AB21 = 3×5 + 17×6 + 14×7 = 215
AB22 = 3×19 + 17×15 + 14×8 = 424
AB23 = 3×3 + 17×9 + 14×16 = 386
AB31 = 9×5 + 8×6 + 10×7 = 163
AB32 = 9×19 + 8×15 + 10×8 = 371
AB33 = 9×3 + 8×9 + 10×16 = 259
Therefore,
		136 380 172
 res=	215 424 386
		163 371 259
 
 */

package Arrays.copy;

public class Multiplication_Of_Matrix 
{
	public static void main(String[] args)
	{
		int arr1[][]= {{3,7},{4,9}};
		int arr2[][]= {{6,2},{5,8}};
		int n=arr1.length;
		int res[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				res[i][j]=0;
				for(int k=0;k<n;k++)
				{
					res[i][j]+=arr1[i][k]*arr2[k][j];
				}
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
