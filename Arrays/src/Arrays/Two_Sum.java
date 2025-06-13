// leetcode - 1
// https://youtu.be/UXDSeD9mN-k
/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */
package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,7,11,15};
		int target=9;
		int res[]=new int[2];
		
		//+++++++++++++++++++++++++++ Brute Force Approach +++++++++++++++++++++++++
		
		/*
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					res[0]=i;
					res[1]=j;
				}
			}
		}
		*/
		
		//+++++++++++++++++++ Better Approach using HashMap +++++++++++++++++++++++
		Map<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.containsKey(target-arr[i]))
				hm.put(arr[i], i);
			else
			{
				res[1]=i;
				res[0]=hm.get(target-arr[i]);
				break;
			}
		}
	
		System.out.println(Arrays.toString(res));
	}
}
