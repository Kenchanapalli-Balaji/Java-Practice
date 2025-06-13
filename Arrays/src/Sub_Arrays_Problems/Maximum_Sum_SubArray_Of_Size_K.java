//https://youtu.be/jhW7VwP2Djw?list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG
package Sub_Arrays_Problems;

public class Maximum_Sum_SubArray_Of_Size_K 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,9,31,-4,21,7};
		int k=3;
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
	}
}
