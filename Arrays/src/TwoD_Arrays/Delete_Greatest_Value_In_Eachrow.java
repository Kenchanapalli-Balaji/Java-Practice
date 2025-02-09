//leet code 2500
package TwoD_Arrays;

import java.util.Arrays;

public class Delete_Greatest_Value_In_Eachrow 
{
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,4},{3,3,1}};
		for(int[] i:arr)
		{
			Arrays.sort(i);
		}
		int sum=0;
		for(int col=0;col<arr[0].length;col++)
		{
			int max=0;
			for(int row=0;row<arr.length;row++)
			{
				if(arr[row][col]>max)
					max=arr[row][col];
			}
			sum+=max;
		}
		System.out.println(sum);
			
	}
}
