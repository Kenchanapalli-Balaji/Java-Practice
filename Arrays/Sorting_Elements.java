package Arrays.copy;

import java.util.Arrays;

public class Sorting_Elements
{
	public static void main(String[] args)
	{
		int ar[]= {5, 2, 8, 7, 1,5};
		System.out.println("Original Array  "+Arrays.toString(ar));
		//Ascending Array
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Ascenidng order  "+Arrays.toString(ar));
		//Descending Array
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Descending order  "+Arrays.toString(ar));
		
	}
}
