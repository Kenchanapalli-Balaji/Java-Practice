 // leetcode -941
// https://youtu.be/rwA_2zxkvaU
	/*
	 Given an array of integers arr, return true if and only if it is a valid mountain array.
	
	Recall that arr is a mountain array if and only if:
	
	arr.length >= 3
	There exists some i with 0 < i < arr.length - 1 such that:
		1. arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
		2. arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
	
	
	Input: arr = [3,5,5]
	Output: false
	Example 3:
	
	Input: arr = [1,2,3,4,5,4,3,2,1]
	Output: true
	 
	
	 */
package Arrays;
public class Valid_Mountain_Array 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,4,3,2,1};
		System.out.println(isValidMountainArray(arr));
	}
	public static boolean isValidMountainArray(int[] arr)
	{
		if(arr.length<3)
			return false;
		int i=0;
		while(i<arr.length-1 && arr[i]<arr[i+1])
		{
			i++;
		}
		if(i==0 || i==arr.length-1)
			return false;
		while(i<arr.length-1 && arr[i]>arr[i+1])
		{
			i++;
		}
		return (i==arr.length-1);
	}
}
