/*
 A happy number is a positive integer that eventually reaches 1 when you repeatedly replace it with the 
 sum of the squares of its digits: 
 Example:
19 is a happy number because 1² + 9² = 82, 8² + 2² = 68, 6² + 8² = 100, and 1² + 0² + 0² = 1 
 */
package numbers;
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
