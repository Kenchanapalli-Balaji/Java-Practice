package numbers;

public class Square_Root_Of_A_Number 
{
	public static void main(String[] args)
	{
		int n=26;
		System.out.println(sqrt(n));
		System.out.println(Math.sqrt(808201));
	}
		//Solution 1 Using for loop
		/*
		for(int i=2;i<n/2;i++)
		{
			if(i*i==n)
			{
				System.out.println(i);
				break;
			}
			else
			{
				System.out.println("There is no exact square root of this number");
				break;
			}
		}
		*/
		
		
		// Solution 2 :- Using Binary search Approach If we did not get exact square root we will print floor value	
		static int sqrt(int n)
		{
			int l=1;
			int h=n/2;
			int res=0;
			while(l<=h)
			{
				int m=(l+h)/2;
				if(m*m==n)
					return m;
				else if(m*m<n)
				{
					l=m+1;
					res=m;
				}
				else
					h=m-1;
			}
			return res;
	}
}
