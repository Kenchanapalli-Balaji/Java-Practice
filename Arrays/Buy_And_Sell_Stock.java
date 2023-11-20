//Leetcode 121
/*
 ex: [7,1,5,3,6,4]
min= 7 and maxprofit=0
step 1: 1<7 -> min=1 and maxprofit=1-1=0;
step 2: 5!<1 -> min=1 and maxprofit= 5-1=4;
step 3 : 3!<1 -> min=1 and maxprofit= 3-1=2 soo still remains 4 only
step 4 : 6!<1 -> min=1 and maxprofit = 6-1 = 5
step 5 : 4!<1 -> min=1 and maxprofit= 4-1 =3 soo still remains 5 only
finally we are returing maxprofit value ..that is 5
 */


package Arrays.copy;

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
