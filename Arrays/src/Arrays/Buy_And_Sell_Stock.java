//Leetcode 121
//https://youtu.be/excAOvwF_Wk
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

	You want to maximize your profit by choosing a single day to buy one stock and choosing a 
	different day in the future to sell that stock.
	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
		
	 ex: [7,1,5,3,6,4]
			min= 7 and maxprofit=0
	step 1 : 1<7  -> min=1 and maxprofit=1-1=0;
	step 2 : 5!<1 -> min=1 and maxprofit= 5-1=4;
	step 3 : 3!<1 -> min=1 and maxprofit= 3-1=2   soo max profit still remains 4 only
	step 4 : 6!<1 -> min=1 and maxprofit = 6-1 = 5
	step 5 : 4!<1 -> min=1 and maxprofit= 4-1 =3 soo still remains 5 only
	finally we are returing maxprofit value ..that is 5
	
	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
	Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
	 */

package Arrays;

public class Buy_And_Sell_Stock 
{
	public static void main(String[] args) 
	{
		int[] prices = {7,1,5,3,6,4};
		int maxprofit=0;
		int min=prices[0];
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]<min)
				min=prices[i];
			maxprofit=Math.max(maxprofit,prices[i]-min);
		}
		System.out.println(maxprofit);
	}
}
