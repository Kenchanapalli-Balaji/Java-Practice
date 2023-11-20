// Create an Array to store the ages of students belonging to 2 schools having 3 classrooms with 5 students
package Arrays.copy;

import java.util.Scanner;

public class Three_Dimensional_Array 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int ar[][][]=new int[2][3][5];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.println("Enter the Age of "+(i+1)+" school "+(j+1)+" class Room "+(k+1)+" student");
					ar[i][j][k]=sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.print(ar[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
