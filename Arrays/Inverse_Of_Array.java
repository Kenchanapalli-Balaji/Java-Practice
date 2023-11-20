//https://youtu.be/wiBvcxRDILY?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Arrays.copy;

import java.util.Arrays;

public class Inverse_Of_Array 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,1,0,4};
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[arr[i]]=i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}
}
