package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move_Zeros_To_End 
{
	public static void main(String[] args)
	{
		int ar[]= {0,1,2,3,0,4,5,6,0,7,8,9,10};
		
		// Brute Force Approach: 
		/*
		 	List<Integer> list=new ArrayList<Integer>();  // Non Zero Elements
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]!=0)
					list.add(ar[i]);
			}
		
			for(int i=0;i<list.size();i++) // Placing the non zero elements in first
			{
				ar[i]=list.get(i);
			}
			for(int i=list.size();i<ar.length;i++) // placing zeros in last remaining places
			{
				ar[i]=0;
			}
			System.out.println(Arrays.toString(ar));
		
		 */
		
		// Optimize Solution 
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0&&ar[j]==0)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			if(ar[j]!=0)
				j++;
		}
		
		//Move zeros to start
		/*
		 int j=ar1.length-1;
		for(int i=ar1.length-1;i>=0;i--)
		{
			if(ar1[i]!=0&&ar1[j]==0)
			{
				int temp=ar1[i];
				ar1[i]=ar1[j];
				ar1[j]=temp;
			}
			if(ar1[j]!=0)
				j--;
		}
		 */
		System.out.println(Arrays.toString(ar));
	}
}
