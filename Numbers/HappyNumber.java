package Numbers;
import java.util.Scanner;

public class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println(isHappy(n));
	}
	/*
	static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int r=n%10;
				sum+=r*r;
				n=n/10;
			}
			n=sum;
		}
		return n==1||n==7;
	}
	*/
	static boolean isHappy(int n)
	{
		if(n<10)
			return n==1||n==7;
		int sum=0;
		do
		{
			int r=n%10;
			sum+=r*r;
			n=n/10;
		}while(n!=0);
		return isHappy(sum);
	}
}
