/*
x\s	For example:
	
	Suppose n1=11 and n2=15.
	
	There is the number 11, which has repeated digits, 
	but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
 */
package Numbers;

public class Non_Repeated_Digit_Numbers
{
	public static void main(String[] args) 
	{
		int n1=101;
		int n2=200;
		int count=0;
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
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total Numbers  "+ count);
	}
}
