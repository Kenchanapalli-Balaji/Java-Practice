/*
 Sum of power of individual digits by their position is equal to original number.
 Exampple : 135 = 1 pow(1)+ 3 pow(2)+5 pow(3) = 1+9+125 = 135
 */
package numbers;

public class DiseriumNumber 
{
	public static void main(String[] args) 
	{
		int n=135;
		int org=n;
		int dc=countDigits(n);
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum+=pow(d,dc);
			dc--;
			n=n/10;
		}
		System.out.println(sum);
	}
	static int countDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
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

}
