package Arrays;

import java.util.Arrays;
public class First_Big_Second_Big 
{
	public static void main(String[] args) 
	{
		int ar[]= {8, 8, 7, 6, 5};
		
		// +++++++++++++++++++++++++++++ Method 1 +++++++++++++++++++++++++++++
		int fbig=ar[0];
		int sbig=Integer.MIN_VALUE;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>fbig)
			{
				sbig=fbig;
				fbig=ar[i];
			}
			else if(ar[i]<fbig && ar[i]>sbig)
				sbig=ar[i];
		}
		System.out.println("First Big Element is :"+fbig);
		System.out.println("Second Big Element is :"+sbig);
		
		// +++++++++++++++++++++++++++++++++++++++ Method 2 ++++++++++++++++++++++++++
		Arrays.sort(ar);
		for(int i=ar.length-2;i>=0;i--)
		{
			if(ar[i]!=ar[i+1])
			{
				System.out.println(ar[i]);
				break;
			}
		}
	}
}
