//https://youtu.be/oABQlhrhXzg?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Arrays;

import java.util.Arrays;

public class Rotate_Array 
{
	//Solution :- Efficient way
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int k=3;
		k=k%arr.length;  // Example : if k=6, then its equal to rotate k%arr.length. i.e 6%5=1;
		if(k<0)			// if K value is negative then we are converting into positive 
			k=k+arr.length;
		reverse(arr,0,k-1);     //  3 2 1 4 5 6 7  Reverse first 3 elements 
		reverse(arr,k,arr.length-1); // 3 2 1 7 6 5 4  Reverse last 4 elements
		reverse(arr,0,arr.length-1);  // 4 5 6 7 1 2 3 Reverse all the elemenns
		System.out.println(Arrays.toString(arr));
	}
	public static void reverse(int arr[], int start, int end)
	{
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	
//______________________________________________________________________________
//////////////////////// Left Rotate by once //////////////////////////////
	/*
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
	
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		*/
	
////////////////////// Right Rotate by once /////////////////////
/*
	int arr[]= {1,2,3,4,5};
	System.out.println(Arrays.toString(arr));

	int temp=arr[arr.length-1];
	for(int i=arr.length-1;i>=1;i--)
	{
		arr[i]=arr[i-1];
	}
	arr[0]=temp;
	System.out.println(Arrays.toString(arr));
*/
	
	
/////////////////////// left Rotate array by K times/////////////////////////
	/*
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		rotate(arr, 5);
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotate_Once(int arr[])
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
	static void rotate(int arr[], int k)
	{
		k=k%arr.length;
		if(k<0)
		{
			k=k+arr.length;
		}
		for(int i=1;i<=k;i++)
		{
			rotate_Once(arr);
		}
	}
	*/
	
	// ++++++++++++++++++++++++++++++++ Third Method ++++++++++++++++++++++++++++
	/*
	int temp[]=new int[k];
	for(int i=0;i<k;i++)
	{
		temp[i]=arr[i];
	}
	for(int i=k;i<arr.length;i++)
	{
		arr[i-k]=arr[i];
	}
	for(int i=arr.length-k;i<arr.length;i++)
	{
		arr[i]=temp[i-(arr.length-k)];
	}
	System.out.println(Arrays.toString(arr));
	*/
}
