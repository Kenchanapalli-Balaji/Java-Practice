//https://youtu.be/Qd_qhRsSays?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Arrays;

public class Maximum_SubArray_Sum 
{
	public static void main(String[] args) 
	{
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		
		
	////////////// Approach 1 /////////////////////////
		
		/*
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				max=Math.max(sum, max);
			}
		}
		System.out.println(max);
		*/
		
		
		
		////////////// Approach 2 /////////////////////////
		
		
		int max=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(sum>=0)
			{
				sum+=arr[i];
			}
			else
				sum=arr[i];
			max=Math.max(max,sum);
		}
		System.out.println(max);
	}
}
