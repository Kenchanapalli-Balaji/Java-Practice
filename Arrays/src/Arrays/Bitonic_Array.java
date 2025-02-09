//https://youtu.be/hV7z1w8u8Us?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
/*
 Bitonic Array:- A Bitonic sequence is a sequence of numbers which is first strictly increasing
 					then after a point strictly decreasing.
	Question : Search in Bitonic Array
				-> Given a Bitonic sequence A of N distict elements,write a program to find a given element 
					B in the bitonic sequence in O(logN) time.
	Example 1 :
			input :
		 			A=[3,9,10,20,17,5,1];
					B=20
			output : 3
			
			In the above Example Bitonic point is 20.
			
			
Algorith : 
			1.Find the point where the array can be split(Bitonic point).
			2.check if the element is at the Bitonic point. if yes return the Bitonic point.
			3.Otherwise perform the Binary search on left and right side of the Bitonic point using Binary search.
 */
package Arrays;

public class Bitonic_Array 
{
	static int ascendingBinarySearch(int arr[], int key,int range)
	{
		int l=0;
		int h=range;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				h=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
	static int descendingBinarySearch(int arr[], int key,int range)
	{
		int l=range;
		int h=arr.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				l=mid+1;
			else
				h=mid-1;	
		}
		return -1;
	}
	static int findBitonicPoint(int arr[])
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
				return mid;
			else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1])
				l=mid;
			else
				r=mid;
		}
		return -1;
	}
	
	static int search(int []a, int key,int bIndex)
	{
		if(key==a[bIndex])
			return bIndex;
		if(key>a[bIndex])
			return -1;
		int res1=ascendingBinarySearch(a, key, bIndex-1);
		if(res1!=-1)
			return res1;
		int res2=descendingBinarySearch(a, key, bIndex+1);
		if(res2!=-1)
			return res2;
		return -1;
		
	}
	public static void main(String[] args) 
	{
		int a[]= {5,6,7,8,9,10,3,2,1};
		int b=10;
		int bitonic_index=findBitonicPoint(a);
		System.out.println(search(a, b, bitonic_index));
	}
}
