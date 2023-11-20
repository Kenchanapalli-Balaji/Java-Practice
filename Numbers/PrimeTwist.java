package Numbers;
 import java.util.Scanner;
class PrimeTwist
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be checked whether prime or not");
		int n=sc.nextInt();		
		/*
		PrimeTwist o =new PrimeTwist();
		o.check(n);
		}
		
		public void check(int n)
		{
			if (n<0)
		{
			System.out.println("PLease enter the Positive number");
		}
		else
		{
			prime(n);
		}
		}
		public void prime(int n)
		{
		int c=0;
		for (int i=2; i<n/2; i++)
		{
			if (n%i==0)
			{
				c++;
			}
		}		
		if (c>=1)
		{
			System.out.println("The entered number is not Prime");
		}
		else
		{
			System.out.println("The entered number is  Prime");
		} 		
		*/	
		int c=0;
		for (int i=2;i<n/2;i++)
		{
			if(n<0)
				System.out.println("enter the positive nUmber");
			else if(n%i==0)
			{
				c++;
			}
		}
		if(c>=1)
		{
			System.out.println("entered number is not prime");
		}
		else
		{
			System.out.println("entered number is prime NUmber");
		}	
	}
}




