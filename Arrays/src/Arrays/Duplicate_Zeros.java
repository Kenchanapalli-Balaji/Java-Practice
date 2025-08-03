//leet code 1089
/*
 Given a fixed-length integer array arr, duplicate each occurrence of zero, 
 shifting the remaining elements to the right.

	Example 1:
	
	Input: arr = [1,0,2,3,0,4,5,0]
	Output: [1,0,0,2,3,0,0,4]
	Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
	Example 2:
	
	Input: arr = [1,2,3]
	Output: [1,2,3]
	Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
package Arrays;
import java.util.Arrays;


public class Duplicate_Zeros 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,0,2,3,0,4,5,0};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=arr.length-1;j>(i+1);j--)
				{
					arr[j]=arr[j-1];
				}
				arr[i+1]=0;
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
