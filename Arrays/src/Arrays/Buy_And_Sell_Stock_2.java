// leetcode - 122
// https://youtu.be/OG0S3VU_yMM?list=PLjOcsOwEjb12jO6RuyzXRyH2U-vhBu_P0
/*
 You are given an integer array prices where prices[i] is the price of 
 a given stock on the ith day.On each day, you may decide to buy and/or sell the stock. 
 You can only hold at most one share of the stock at any time. However, you can buy it then 
immediately sell it on the same day.
Find and return the maximum profit you can achieve.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
 */
package Arrays;

public class Buy_And_Sell_Stock_2
{
	public static void main(String[] args) 
	{
		int[] arr= {7,1,5,3,6,4};
		int max_profit=0;
		for(int i=0;i<arr.length-1;i++)
		{
			// checking if i'th next element is > , then we can book a profit
			if(arr[i]<arr[i+1])
				max_profit+=arr[i+1]-arr[i];
		}
		System.out.println(max_profit);
	}
}
