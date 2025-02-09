package Arrays;

import java.util.Arrays;

//program to COMBINE TWO ARRAYS IN ZIGZAG manner
public class Zigzag 
{
	public static void main(String[] args) 
	{
		int ar1[]= {1,2,3,4,5,6};
		int ar2[]= {7,8,9,10,11,12};
		
		int res[]=new int[ar1.length+ar2.length];
		int i=0;
		int j=0;
		for(int k=0;k<res.length;)
		{
			if(i<ar1.length)
			{
				res[k]=ar1[i];
				i++;
				k++;
			}
			if(j<ar2.length)
			{
				res[k]=ar2[j];
				j++;
				k++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
