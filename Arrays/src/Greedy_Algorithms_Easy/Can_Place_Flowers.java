// leetcode - 605
/*
 You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers 
 cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and
 an integer n, return true if n new flowers can be planted in the flowerbed without violating 
 the no-adjacent-flowers rule and false otherwise.
Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 */
package Greedy_Algorithms_Easy;

public class Can_Place_Flowers {
	public static void main(String[] args) {
		int[] arr= {1,0,0,0,1};
		int n=1;
		System.out.println(canPlaceFlowers(arr, n));
	}
	static boolean canPlaceFlowers(int[] arr, int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			int left = (i==0) ? 0 : arr[i-1];
			int right = (i==arr.length-1) ? 0 : arr[i+1];
			
			if(arr[i]==0 && left==0 && right==0)
			{
				arr[i]=1;
				n--;
			}
		}
		return n<=0;
	}

}
