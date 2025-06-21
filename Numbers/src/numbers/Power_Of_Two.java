// leetcode - 231
// https://youtu.be/ta17SZ_t-_M?list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
package numbers;

public class Power_Of_Two 
{
	public static void main(String[] args) 
	{
		int n=15;
		boolean isPowerOfTwo=true;
		while(n!=1)
		{
			if(n%2!=0)
			{
				isPowerOfTwo=false;
				break;
			}
			else
				n=n/2;
		}
		System.out.println(isPowerOfTwo);
	}
}
