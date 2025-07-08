//https://www.youtube.com/watch?v=yFgN2KlOrew&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=46

package Sub_Arrays_Problems;

public class Count_Subsets_With_Given_Sum 
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,15,5};
		int k=25;
		System.out.println(countSubsets(arr, k, 0));		
	}
	public static int countSubsets(int arr[],int sum, int i)
	{
		if(sum==0)
			return 1;
		if(sum<0)
			return 0;
		if(i==arr.length)
			return 0;
		//System.out.println(sum);
		// either pic the element and not picking the element
		return countSubsets(arr,sum-arr[i],i+1)+countSubsets(arr, sum,i+1);
	}
}
