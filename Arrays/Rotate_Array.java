//https://youtu.be/oABQlhrhXzg?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Arrays.copy;

import java.util.Arrays;

public class Rotate_Array 
{
	//Solution :- Efficient way
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int k=3;
		k=k%arr.length;
		if(k<0)
			k=k+arr.length;
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
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
//Solution :- Left Rotate by once
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
//____}___________________________________________________________________
		
//Solution :- left Rotate array by K times
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
}
