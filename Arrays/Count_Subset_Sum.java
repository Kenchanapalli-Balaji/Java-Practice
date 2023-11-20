//https://www.youtube.com/watch?v=yFgN2KlOrew&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=46
package Arrays.copy;

public class Count_Subset_Sum 
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,15,5};
		int sum=25;
		System.out.println(countSubsets(arr, sum, 0));
	}
	public static int countSubsets(int arr[],int sum, int i)
	{
		if(sum==0)
			return 1;
		if(sum<0)
			return 0;
		if(i==arr.length)
			return 0;
		System.out.println(sum);
		return countSubsets(arr,sum-arr[i],i+1)+countSubsets(arr, sum,i+1);
	}
}
