// leetcode - 1781
// https://youtu.be/ARLutVfhw2I
/*
 The beauty of a string is the difference in frequencies between the most 
 frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.

Example 1:

Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], 
each with beauty equal to 1.
Example 2:

Input: s = "aabcbaa"
Output: 17
 */
package Substrings;

public class Sum_Of_Beauty_Of_All_Substrings 
{
	public static void main(String[] args) 
	{
		String s= "aabcb";
		/////////////////// Using Brute Force Approach ///////////////////
		 // step 1 : Find all the substrings 
		 // step 2 : count of Every Character frequency in substring 
		// step 3 : find the difference b/w the max count and min count
		
		System.out.println(beautyOfSum(s));
	}
	static int beautyOfSum(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			int[] freq=new int[26];
			for(int j=i;j<s.length();j++)
			{
				freq[s.charAt(j)-'a']++; // freq[s.charAt(j)-97]++;
				sum+=getBeauty(freq);
			}
		}
		return sum;
	}
	static int getBeauty(int[] freq)
	{
		int maxCount=0;
		int minCount=Integer.MAX_VALUE;
		for(int i:freq)
		{
			if(i>0)
			{
				maxCount=Math.max(maxCount, i);
				minCount=Math.min(minCount, i);
			}
		}
		return maxCount-minCount;
	}
}
