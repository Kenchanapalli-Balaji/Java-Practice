//https://youtu.be/Qd_qhRsSays?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
//leetcode - 53
package Sub_Arrays_Problems;

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
		System.out.println("Maximum Sum: "+max);
		
		//////////////////////// Follow Up Question ///////////////////////////
		// To print the sub array of the maximum sub array 
		
		int max1=0;
		int sum1=0;
		int start=0;
		int end=0;
		int tempstart=0;
		for(int i=0;i<arr.length;i++)
		{
			if(sum1>=0)
				sum1+=arr[i];
			else
			{
				sum1=arr[i];
				tempstart=i;
			}
			if(sum1>max1)
			{
				max1=sum1;
				start=tempstart;
				end=i;
			}	
		}
		System.out.print("Sub array : ");
		for(int i=start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
