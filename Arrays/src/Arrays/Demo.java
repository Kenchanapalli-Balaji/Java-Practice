package Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Demo
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,4,3,8,1};
		boolean res=isValidMountainArray(arr);
		System.out.println(res);
	}
	static boolean isValidMountainArray(int[] arr)
	{
		int i=0;
		while(i<arr.length-1 && arr[i]<arr[i+1])
			i++;
		if(i==0 || i==arr.length-1)
			return false;
		while(i<arr.length-1 && arr[i]>arr[i+1])
			i++;
		return (i==arr.length-1);
	}
}

