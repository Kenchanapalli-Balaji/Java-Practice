package Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Demo
{
	public static void main(String[] args) 
	{
		int[] arr= {0,3,7,2,5,8,4,6,0,1};
		int last_smaller=Integer.MIN_VALUE;
		int longest=1;
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-1==last_smaller)
			{
				count++;
				last_smaller=arr[i];
			}
			else if(arr[i]-1!=last_smaller)
			{
				count=1;
				last_smaller=arr[i];
			}
			longest=Math.max(longest, count);
		}
		
		System.out.println(longest);
	}	
	
}