 //TUF
// https://youtu.be/1xNbjMdbjug
package Numbers;

import java.util.ArrayList;
import java.util.List;

public class Divisors_Of_N 
{
	public static void main(String[] args) 
	{
		int n=36;
		List<Integer> list=new ArrayList<Integer>();
		// +++++++++++++++++ Method 1 +++++++++++++++++++++++
		/*
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				list.add(i);
		}
		*/
		
		// +++++++++++++++++++++++ Method 2 ++++++++++++++++++++++
		
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				list.add(i);
				if(n/i!=i)
					list.add(n/i);
			}
		}
		System.out.println(list);
		
	}
}
