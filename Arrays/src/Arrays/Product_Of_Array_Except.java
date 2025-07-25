// leetcode - 238
// https://youtu.be/87PW4u9NwI0
package Arrays;

import java.util.Arrays;

/*
 Given an array of integers arr[], return an arrays res[] such that res[i] is equal 
 to the product of all the elements of arr except arr[i].
 
 Example : 
 input : ar[]={1,2,3,4}
 output : res[]={24,12,8,6}.
 			
 */
public class Product_Of_Array_Except 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		int[] res=new int[arr.length];
		int prodL=1;
		int prodR=1;
		for(int i=arr.length-1;i>=0;i--)
		{
			res[i]=prodR;
			prodR=prodR*arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			res[i]=res[i]*prodL;
			prodL=prodL*arr[i];
		}
		System.out.println(Arrays.toString(res));
		
		
		//////////////////////// Brute Force approach ////////////////////
		/*
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
		*/
	}
}
