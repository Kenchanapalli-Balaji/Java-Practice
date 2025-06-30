// leetcode - 238
package Arrays;

import java.util.Arrays;

/*
 Given an array of integers ar[], return an arrays res[] such that res[i] is equal to the product
 of all the elements of ar except ar[i].
 
 Example : 
 input : ar[]={1,2,3,4}
 output : res[]={24,12,8,6}.
 			
 */
public class Product_Of_Array_Except 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4};
		int res[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int prod=1;
			for(int j=0;j<ar.length;j++)
			{
				if(j!=i)
					prod=prod*ar[j];
			}
			res[i]=prod;
		}
		System.out.println(Arrays.toString(res));
	}
}
