package Arrays;

public class Missing_Number_In_Array 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,6,7,8};
		int n=ar.length+1;
		// int n=ar.length; // if 0 Presents in given array
		int sum=n*(n+1)/2;
		for(int i:ar)
		{
			sum-=i;
		}
		System.out.println("Missing Number is : "+sum);
		
		
		// +++++++++++++++++++ Brute Force Approach +++++++++++++++++++++++
		/*
		for(int i=1;i<ar.length;i++)
		{
			int flag=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]==i)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
				break;
			}
		}
		*/
	}
}
