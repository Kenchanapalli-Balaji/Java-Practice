// https://www.youtube.com/watch?v=1ibsQrnuEEg
/*
 You have n items; the i-th item has value val[i] and weight wt[i].

A knapsack can carry at most capacity units of weight.

You may take any fraction of an item (i.e. split items).

Return the maximum total value that can be placed in the knapsack, rounded to exactly 6 decimal places.


Example 1

Input: val = [60,100,120], wt = [10,20,30], capacity = 50

Output: 240.000000

Explanation:

 • Take item 0 (w=10, v=60)

 • Take item 1 (w=20, v=100)

 • Take 2⁄3 of item 2 (w=20, v=80)

Total value = 60 + 100 + 80 = 240

Example 2

Input: val = [60,100], wt = [10,20], capacity = 50

Output: 160.000000

Explanation: Both items fit entirely (total weight 30 ≤ 50).
 */
package Greedy_Algorithms_Easy;

import java.util.Arrays;

public class Fractional_Knapsack {

	static class Item{
		int value; int weight; double ratio ;
		Item(int value, int weight)
		{
			this.value = value; 
			this.weight = weight;
			this.ratio = (double) value/weight;
		}
	}
	
	static double fun(int[] val, int[] wt, int capacity) {
		int n = val.length;
		Item[] items = new Item[n];
		for(int i=0;i<n;i++)
			items[i]= new Item(val[i],wt[i]);
		
		// Sort by value/weight ratio in descending order
		Arrays.sort(items,(a,b)->Double.compare(b.ratio, a.ratio));
		
		double totalValue = 0.0;
		return 0.0;
	}
}
