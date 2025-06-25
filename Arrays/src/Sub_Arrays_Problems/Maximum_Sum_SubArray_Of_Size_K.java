//https://youtu.be/jhW7VwP2Djw?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Sub_Arrays_Problems;

public class Maximum_Sum_SubArray_Of_Size_K 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,9,31,-4,21,7};
		int k=3;
		////////////////////////////// Brute Force Approach ///////////////////
		/*
		for(int i=0;i<=arr.length-k;i++)
		{
			int csum=0;
			for(int j=i;j<i+k;j++)
			{
				csum=csum+arr[j];
				System.out.print(arr[j]+" ");
			}
			System.out.println("="+csum);	
		}
		*/
		
		////////////////// Using Sliding Window technique Approach //////////////////
		 int windowSum=0;
		 int max=Integer.MIN_VALUE;
		 for(int i=0; i<k;i++)  // 1st window sum i.e -> index of 0,1,2 since k=3.
			 windowSum+=arr[i];
		 
		 for(int i=k;i<arr.length;i++) // slides are 0,1,2 and 1,2,3 and 2,3,4 .......
		 {
			 max=Math.max(max, windowSum);
			 windowSum=windowSum-arr[i-k]+arr[i];  // removing 1st index and adding next index element
		 }
		 System.out.println(max);
	}
}
