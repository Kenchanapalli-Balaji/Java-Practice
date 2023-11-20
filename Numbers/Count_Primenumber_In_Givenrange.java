package Numbers;

import java.util.Scanner;
import java.util.ArrayList;

class Count_Primenumber_In_Givenrange {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of N ");
	int n=sc.nextInt();
	//ArrayList al=new ArrayList();
	for (int i=1;i<=n;i++)
	{
		boolean isPrime=true;
		for (int j=2;j<=i/2;j++)
		{
			if (i%j==0) 
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime) 
		{
			//al.add(i);
			System.out.println(i+ " ");
		}
	}
	//System.out.println(al);
	//System.out.println("enter the number which index nuber you want to print");
	//System.out.println(al.get(sc.nextInt()));
	
}
}
