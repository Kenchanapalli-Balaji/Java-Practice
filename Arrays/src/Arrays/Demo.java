package Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Demo
{
	public static void main(String[] args) 
	{
	
		int[] arr= {0,0,1,1,1,1,2,3,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
	}
	static int removeDuplicates(int[] arr)
	{
		int count=2;
		for(int i=2;i<arr.length;i++)
		{
			if(arr[count-2]!=arr[i])
			{
				arr[count++]=arr[i];
			}
		}
		return count;
	}
	
	
	
}

