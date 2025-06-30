// leetcode - 67
// https://youtu.be/SgMO9cHTZ0U?list=PLjOcsOwEjb12jO6RuyzXRyH2U-vhBu_P0
/*
 Given two binary strings a and b, return their 
 sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
 */
package Arrays;

public class Add_Binary 
{
	public static void main(String[] args) 
	{
		String a="11"; 
		String b="1";
		int i=a.length()-1; 
		int j=b.length()-1;
		int carry=0;
		StringBuilder sb=new StringBuilder();
		while(i>=0 || j>=0)
		{
			int sum=carry;
			if(i>=0)
			{
				sum+=a.charAt(i)-'0';
				i--;
			}
			if(j>=0)
			{
				sum+=b.charAt(j)-'0';
				j--;
			}
			sb.append(sum%2);
			carry=sum/2;	
		}
		sb.append(carry);
		System.out.println(sb.reverse().toString());
	}
}
