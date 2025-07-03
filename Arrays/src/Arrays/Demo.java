package Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Demo
{
	public static void main(String[] args) 
	{

		int[] arr= {2,3,1,1,4};
		int farthest=0;
		int end=0;
		int jump=0;
		for(int i=0;i<arr.length-1;i++)
		{
			farthest=Math.max(farthest, i+arr[i]);
			if(i==end)
			{
				jump++;
				end=farthest;
			}
		}
		System.out.println(jump);
	}

	
}