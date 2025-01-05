package numbers;
import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year to find the leap year or not");
		int year=sc.nextInt();
		if ((year%4==0 && year%100 !=0) || year % 400 ==0)
		{
			System.out.println("entered year : "+ year + "is LEAP Year");
		}
		else 
		{
			System.out.println("entered year " +year + " is not Leap Year");
		}
	
	}
}

