package Arrays.copy;

import java.util.Arrays;

public class RemoveOddIntegersFromArray 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,6,7,8,9,10,11};
		int count=0;
		for(int i=0;i<ar.length;i++) 
		{
			if(ar[i]%2==0)
				count++;
		}
		int ar2[]=new int[count];
		int index=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				ar2[index]=ar[i];
				index++;
			}
		}
		System.out.println("Orginal Array : "+Arrays.toString(ar));
		System.out.println("After Removing Odd elements From Array : "+Arrays.toString(ar2));
	}
}
