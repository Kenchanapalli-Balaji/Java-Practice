// leetcode - 860
// https://youtu.be/n_tmibEhO6Q?list=PLgUwDviBIf0rF1w2Koyh78zafB0cz7tea
/*
 At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to 
 buy from you and order one at a time (in the order specified by bills). 
 Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. 
 You must provide the correct change to each customer so that the net transaction is 
 that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, 
return true if you can provide every customer with the correct change, or false otherwise.

Example 1:

Input: bills = [5,5,5,10,20]
Output: true
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.
 */
package Greedy_Algorithms;

public class Lemonade_Change 
{
	public static void main(String[] args) 
	{
		int[] bills= {5,5,5,10,20};
		System.out.println(canSell(bills));
	}
	static boolean canSell(int[] arr)
	{
		int five=0;
		int ten=0;
		for(int i:arr)
		{
			if(i==5)
				five++;
			else if(i==10)
			{
				if(five>0)
				{
					ten++;
					five--;
				}
				else
					return false;
			}
			else // in case of 20 Rupees
			{
				if(five>0 && ten>0)
				{
					five--;
					ten--;
				}
				else if(five>=3)
					five-=3;
				else
					return false;
			}
		}
		return true;
	}
}
