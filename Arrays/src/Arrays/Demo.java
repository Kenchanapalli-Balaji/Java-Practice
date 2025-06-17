package Arrays;
import java.util.*;

class Demo
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,-2,4};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int prod=1;
			for(int j=i;j<arr.length;j++)
			{
				prod=prod*arr[j];
				max=Math.max(max, prod);
			}
		}
		System.out.println(max);
		
	}
	  
}

