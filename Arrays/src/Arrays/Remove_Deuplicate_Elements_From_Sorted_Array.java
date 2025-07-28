// leetcode - 26
//https://youtu.be/I0vmCnkcGW4
package Arrays;

import java.util.Arrays;

public class Remove_Deuplicate_Elements_From_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,2,3,3,4,6,6};
		System.out.println(Arrays.toString(arr));
		
		int rd=removeDuplicate(arr);
		System.out.println(rd);
		for(int i=0;i<rd;i++)
			System.out.print(arr[i]+" ");
	}
	public static int removeDuplicate(int[] arr)
	{
		int rd=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				arr[rd]=arr[i];	
			}	
		}
		return rd+1;
	}
}
