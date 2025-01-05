/*
x\s	For example:	
	Suppose n1=11 and n2=15.
	
	There is the number 11, which has repeated digits, 
	but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
 */
package numbers;

import java.util.ArrayList;
import java.util.List;

public class Non_Repeated_Digit_Numbers
{
	public static void main(String[] args) 
	{
		int n1=101;
		int n2=200;
		List<Integer> nonrepeated = new ArrayList<Integer>();
		List<Integer> repeated = new ArrayList<Integer>();
		for(int i=n1;i<=n2;i++)
		{
			int num=i;
			boolean visited[]=new boolean[10];
			while(num>0)
			{
				if(visited[num%10]==true)
					break;
				visited[num%10]=true;
				num=num/10;
			}
			if(num==0)
			{
				nonrepeated.add(i);
			}
			else
				repeated.add(i);
		}
		System.out.println("Total non repeated digit Numbers is :  "+ nonrepeated.size());
		System.out.println("Toal repeated digit numbers is: "+repeated.size());
		System.out.println(nonrepeated);
		System.out.println(repeated);
	}
}
