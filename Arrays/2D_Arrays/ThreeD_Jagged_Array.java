/*
 Create a array To store the ages of students belonging to 2 schools.
 1st school having 3 classrooms. 
 	->1st class room having 2 students
 	-> 2nd class room having 3 students
 	-> 3rd class room having 3 students
 2nd School Having a 2 Class Rooms
 	->1st Class Room having a 2 students
 	-> 2nd class room having a 3 students
 */
package Arrays.copy;

import java.util.Scanner;

public class ThreeD_Jagged_Array 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ar[][][]=new int[2][][];
		ar[0]=new int[3][];
		ar[1]=new int[2][];
		ar[0][0]=new int[2];
		ar[0][1]=new int[3];
		ar[0][2]=new int[3];
		ar[1][0]=new int[2];
		ar[1][1]=new int[3];
		
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
