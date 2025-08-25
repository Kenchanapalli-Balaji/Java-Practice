// leetcode - 2150
/*
 You are given an integer array nums. A number x is lonely when it appears only once,
  and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.

Return all lonely numbers in nums. You may return the answer in any order.
Example 1:

Input: nums = [10,6,5,8]
Output: [10,8]
Explanation: 
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
 */
package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lonely_Numbers_In_Array 
{
	public static void main(String[] args) 
	{
		int[] arr={10,6,5,8};
		List<Integer> list=new ArrayList<Integer>();
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i:arr)
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		for(int i:hm.keySet())
		{
			if(hm.get(i)==1 && !hm.containsKey(i+1) && !hm.containsKey(i-1))
				list.add(i);
		}
		System.out.println(list);
	}
}
