package Arrays.copy;

import java.util.Arrays;
import java.util.Scanner;

public class Array_From_User_Input 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("enter the elements of Array");
		for(int i=0;i<ar.length;i++)
		{
			int ele=sc.nextInt();
			ar[i]=ele;
		}
		System.out.println(Arrays.toString(ar));
	}
}
