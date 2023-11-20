/*create a array to store the ages of students belonging to to 2 classes where first 
class room has 3 students and 2nd class room has 5 students.*/
package Arrays.copy;

import java.util.Scanner;

public class jagged_Array
{
	public static void main(String[] args) 
	{
		int ar[][]=new int[2][];
		ar[0]=new int[3];
		ar[1]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter the Age of "+i+" class Room student "+j);
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
