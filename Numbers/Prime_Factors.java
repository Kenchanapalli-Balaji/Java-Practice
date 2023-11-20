package Numbers;

public class Prime_Factors 
{
	public static void main(String[] args) 
	{
		int n=28;
		int i=2;
		while(n>1)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
		
		
		// Solution 2
		/*
		 int n=28;
		for(int i=2;i<=n/2;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
		 */
	}
}
