/*
 Example 1:
		Input: digits = [1,2,3]
		Output: [1,2,4]
		Explanation: The array represents the integer 123.
		Incrementing by one gives 123 + 1 = 124.
		Thus, the result should be [1,2,4].
Example 2:

		Input: digits = [4,3,2,1]
		Output: [4,3,2,2]
		Explanation: The array represents the integer 4321.
		Incrementing by one gives 4321 + 1 = 4322.
		Thus, the result should be [4,3,2,2].

Example 3:

		Input: digits = [9]
		Output: [1,0]
		Explanation: The array represents the integer 9.
		Incrementing by one gives 9 + 1 = 10.
		Thus, the result should be [1,0].
 */

package Arrays;

import java.util.Arrays;

public class PlusOne 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,2,9};
		int res[]=addition(arr);
		System.out.println(Arrays.toString(res));
	}
	public static int[] addition(int digits[])
	{
		for(int i=digits.length-1;i>=0;i--)
		{
			digits[i]+=1;
			if(digits[i]!=10)
				return digits;
			digits[i]=0;
		}
		int res[]=new int[digits.length+1];
		res[0]=1;    // By default remaining values will be zero only after iteration
		return res;
	}
}
