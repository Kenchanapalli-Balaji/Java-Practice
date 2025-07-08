// leetcode - 152
// https://youtu.be/hnswaLJvr6g
/*
 Given an integer array nums, find a subarray that has the largest product, 
 and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
 */
package Sub_Arrays_Problems;

public class Maximum_Product_SubArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,-2,4};
		
		//////////////////////// Brute Force Approach /////////////////
		/*
		int maxProd=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int prod=1;
			for(int j=i;j<arr.length;j++)
			{
				prod=prod*arr[j];
				maxProd=Math.max(maxProd, prod);
			}
		}
		System.out.println(maxProd);
		*/
		
		////////////////////// Optimal Approach ///////////////////
		/*
		 -> 
		 */
		int maxprod=Integer.MIN_VALUE;
		int prefixProd=1; 
		int suffixProd=1;
		for(int i=0;i<arr.length;i++)
		{
			if(prefixProd==0)
				prefixProd=1;
			if(suffixProd==0)
				suffixProd=1;
			prefixProd=prefixProd*arr[i];
			suffixProd=suffixProd*arr[arr.length-i-1];
			maxprod=Math.max(maxprod, Math.max(prefixProd, suffixProd));
		}
		System.out.println(maxprod);
	}
}
