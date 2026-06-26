// leetcode - 179
// https://www.youtube.com/watch?v=q_biivSGbV0&t=129s
/*
 Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.


Example 1:

Input: nums = [10,2]
Output: "210"
 */
package Greedy_Algorithms;

import java.util.Arrays;

public class Largest_Number {
		public static void main(String[] args) {
			int[] arr = {3,30,34,5,9};
			String[] s=new String[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				s[i]= String.valueOf(arr[i]);
			}
			Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
			StringBuilder sb = new StringBuilder();
			for(String str:s)
				sb.append(str);
			System.out.println(sb.toString());
		}
		
}
