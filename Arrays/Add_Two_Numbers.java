/*
 Q : Given an array Of Integers, return pair of numbers such that they add 
 	upto a specific target.
     
 Example : 
 		Given an array Integers -{2,11,5,10,7,8};, target =9;
 Solution :
 		Since 2+7=9, return {2,7};
 */

package Arrays.copy;

import java.util.Arrays;

public class Add_Two_Numbers 
{
	public static void main(String[] args) 
	{
		int ar[]= {2,11,5,8,10,7};
		int target=9;
		int ar2[]=new int[2];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==target)
				{
					ar2[0]=ar[j];
					ar2[1]=ar[i];
				}
			}
		}
		System.out.println(Arrays.toString(ar2));
	}
}
