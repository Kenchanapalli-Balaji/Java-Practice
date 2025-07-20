// https://youtu.be/mVg9CfJvayM?list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma
/*
 Given an integer array of coins representing coins of different denominations and 
 an integer amount representing a total amount of money. Return the fewest number of 
 coins that are needed to make up that amount. If that amount of money cannot be 
 made up by any combination of the coins, return -1. There are infinite numbers of 
 coins of each type

Examples:
Input: coins = [1, 2, 5], amount = 11

Output: 3

Explanation: 11 = 5 + 5 + 1. We need 3 coins to make up the amount 11.
 */
package Greedy_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Number_Of_Coins 
{
	public static void main(String[] args) 
	{
		int[] coins= {1,2,5,10,20,50,100,500};
		List<Integer> list=new ArrayList<Integer>();
		int value=49;
		for(int i=coins.length-1;i>=0;i--)
		{
			while(value>=coins[i])
			{
				value=value-coins[i];
				list.add(coins[i]);
			}
		}
		if(list.isEmpty())
		System.out.println(list);
		System.out.println("Minimum number of coins required is : "+list.size());
	}
}
