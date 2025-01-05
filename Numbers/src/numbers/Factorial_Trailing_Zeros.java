//https://youtu.be/57hXUDXVY8s
//leetcode-172
//Given an integer n, return the number of trailing zeroes in n!.
package numbers;
import java.util.Scanner;

public class Factorial_Trailing_Zeros 
{
	public static void main(String[] args) 
	{
		int n=25;
		int count=0;
		int powerOf5=5;
		while(n>=powerOf5)
		{
			count+=n/powerOf5;
			powerOf5=powerOf5*5;
		}
		System.out.println(count);
	}
}
