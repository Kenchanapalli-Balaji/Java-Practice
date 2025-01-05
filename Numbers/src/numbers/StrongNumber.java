/*
 	Sum of factorial of individual digits is equal to original number.
 	Example : 145 = 1!+4!+5! = 1+24+120 = 145
 */
package numbers;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		int n=145;
		int org=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+fact(d);
			n=n/10;
		}
		System.out.println(sum);
	}
	static int fact(int n)
	{
		int res=1;
		while(n>0)
		{
			res=res*n;
			n--;
		}
		return res;
	}
}
