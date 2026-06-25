// leetcode - 1013
/*
 Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.

Formally, we can partition the array if we can find indexes i + 1 < j with (arr[0] + arr[1] + ... + arr[i]
 == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])
 
Example 1:

Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 */
package Greedy_Algorithms_Easy;

public class Partition_Array_Into_Three_Parts_With_Equal_Sum {
	public static void main(String[] args) {
		int[] arr= {0,2,1,-6,6,-7,9,1,2,0,1};
		System.out.println(canPartition(arr));
	}
	static boolean canPartition(int[] arr)
	{
		int total =0;
		for(int i:arr)
			total+=i;
		int res = total/3;
		if(total % 3!=0)
			return false;
		int currentSum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			currentSum+=arr[i];
			if(currentSum==res)
			{
				count++;
				currentSum=0;
			}
		}
		return count>=3;
	}

}
