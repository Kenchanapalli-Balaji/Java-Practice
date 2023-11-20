package Numbers;
class ArmStrongNumber
{
	public static void main(String[] args) 
	{
		int n=371;
		int n1=n;
		int n2=n;
		int total=0;
		int count=0;
		int remainder;
		
		while(n1!=0)
		{
			n1=n1/10;
			count++;
		}
		
		while(n2!=0)
		{
			remainder=n2%10;
			total +=Math.pow(remainder,count);
			n2=n2/10;
		}
		
		System.out.println("No.of Digits in Given Number  :"+count);
		System.out.println("sum of the Nth powers of their digits."+total);
		if(n==total)
			System.out.println("given number is ARMSTRONG");
		else
			System.out.println("Given number is NOT ArmStrong Number");
	}
}

/*

public class Demo 
{
	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) 
	{
		int n=1634;
		int n1=n;
		int sum=0;
		int org=n;
		int digits=0;
		while(n>0)
		{
			digits++;
			n=n/10;
		}
		while(n1>0)
		{
			int rem=n1%10;
			sum=sum+pow(rem,digits);
			System.out.println(sum);
			n1=n1/10;
		}
		System.out.println(digits);
		if(sum==org)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
*/