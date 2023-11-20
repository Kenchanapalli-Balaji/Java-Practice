package Arrays.copy;

import java.util.Scanner;

public class TwoDiemensionalArray 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no's rows");
		int row=sc.nextInt();
		System.out.println("Enter the no's columns");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter the element of : "+i +" and "+j);
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
