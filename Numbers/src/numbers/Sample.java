package numbers;
import java.util.*;

public class Sample 
{
	public static void main(String[] args) 
	{
		int n=19;
		System.out.println(isHappy(n));
	}
	static boolean isHappy(int n)
	{
		if(n<10)
			return n==1||n==7;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r;
			n=n/10;
		}
		return isHappy(sum);
	}
}