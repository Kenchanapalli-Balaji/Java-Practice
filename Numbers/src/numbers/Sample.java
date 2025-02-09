package numbers;
import java.util.*;

public class Sample 
{
	public static void main(String[] args) 
	{
		int n=8;
		int sum=n*(n+1)/2;
		int sumr=0;
		for(int i=1;i<=n;i++)
		{
			if(sum==sumr+i)
				System.out.println(i);
			sum=sum-i;
			sumr=sumr+i;
		}
	}
}