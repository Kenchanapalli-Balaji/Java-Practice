package Arrays.copy;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays
{
	public static void main(String[] args)
	{
		int ar1[]= {1,3,5,7,9};
		int ar2[]= {2,4,6,8};
		int res[]=new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		while(i<ar1.length&&j<ar2.length)
		{
			if(ar1[i]<ar2[j])
			{
				res[k]=ar1[i];
				i++;
			}
			else
			{
				res[k]=ar2[j];
				j++;
			}
			k++;
		}
		while(i<ar1.length)
		{
			res[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length)
		{
			res[k]=ar2[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println(Arrays.toString(res));
		
		
	}
}
