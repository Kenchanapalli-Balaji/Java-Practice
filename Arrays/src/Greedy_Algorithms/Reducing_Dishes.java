// leetcode- 1402
//https://youtu.be/dp3pbIqfKjs
/*
 You are a chef in Restaurant, each dish has a rating that how much satisfaction it provides to customers
 -> A positive rating increases the customer satisfaction.
 -> A rating of 0 has no effect.
 
 Preparing a dish takes exactly 1 unit of time.
 If a dish with rating r is served at time t, its contribution to the restaurant total satisfaction is r*t;
 where :
 -> The first served dish has t=1;
 -> The second served dish has t=2; etc....
 Return the maximum total satisfaction that can be achieved.
 Example ::
 Input : dishRatings = [-1,-8,0,5,-9]
 OutPut = 14 
 
 Explanation :
 serve -1 at time 1 = -1*1 = -1;
 serve 0 at time 2 = 0*2 = 0;
 serve 5 at time 5 = 5*3 = 15;
 -1 + 0 + 15 = 14;
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Reducing_Dishes {
	public static void main(String[] args) {
		int[] rating = {-1,-8,0,5,-9};
		
		System.out.println("Maximum Profit :"+ getMax(rating));
	}
	
	static int getMax(int[] arr)
	{
		Arrays.sort(arr);
		int suffixSum = 0;
		int maxProfit =0;
		for(int i=arr.length-1;i>=0;i--) {
			suffixSum +=arr[i];
			if(suffixSum>0) {
				maxProfit+=suffixSum;
			}else
				break;
		}
		return maxProfit;
	}

}
