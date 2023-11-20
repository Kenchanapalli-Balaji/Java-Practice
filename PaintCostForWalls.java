import java.util.Scanner;
class PaintCostForWalls
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int  N,E;
		float intP=18, extP=12, cost=0, temp;
		System.out.println("enter the total number of INterior Walls");
		N=sc.nextInt();
		System.out.println("enter the total number of EXterior Walls");
		E=sc.nextInt();
		
		if(N<0 || E<0)
		{
			System.out.println("Invalid Input");
		}
		
		else if(N==0 && E==0)
		{
			System.out.println("The Estimated cost is:  0.0");
		}
		
		else 
		{
			for (int i=0;i<N;i++)
			{
				System.out.println("enter the size of walls for Interior wall "+(i+1));
				temp=sc.nextFloat();
				cost +=intP*temp;
			}
			for (int i=0;i<E;i++)
			{
				System.out.println("enter the size of walls for Exterior wall "+(i+1));
				temp=sc.nextFloat();
				cost +=extP*temp;
			}
		}
		
		
		System.out.println("The Estimated Cost for full Painting is :" +cost);
	}
}



/* Problem Statement

We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior
4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:

6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR */



