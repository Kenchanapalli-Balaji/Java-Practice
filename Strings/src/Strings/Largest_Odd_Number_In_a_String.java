// leetcode - 1903 
// https://youtu.be/eICBvqI4qTE
/*
 Given a string s, representing a large integer, the task is to 
 return the largest-valued odd integer (as a string) that is a substring of the given string s.

The number returned should not have leading zero's. 
But the given input string may have leading zero.

Example 1 :
Input : s = "5347"
Output : "5347"
Explanation : The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.

Example 2 :
Input : s = "0214638"
Output : "21463"
Explanation : The different odd numbers that can be formed by the given string 
are --> 1, 3, 21, 63, 463, 1463, 21463.
We cannot include 021463 as the number contains leading zero.
So largest odd number in given string is 21463.
 */
package Strings;

public class Largest_Odd_Number_In_a_String 
{
	public static void main(String[] args) 
	{
		String s = "5347";
		for(int i=s.length()-1;i>=0;i--)
		{
		  //if(Character.getNumericValue(s.charAt(i)) %2!=0)
			if(s.charAt(i)-'0'%2!=0)
			{
				System.out.println(s.substring(0,i+1));
				return;
			}
		}
	}
}
