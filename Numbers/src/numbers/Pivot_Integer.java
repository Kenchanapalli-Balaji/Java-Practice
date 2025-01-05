// Leet code- 2485
/*
 The sum of all elements between 1 and x inclusively equals the sum of all elements
  between x and n inclusively.
  
  Example :
	Input: n = 8
	Output: 6
	Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
 */
package numbers;

public class Pivot_Integer
{
	public static void main(String[] args) 
	{
		int n=8;
		int sum=(n*(n+1))/2;
		System.out.println(sum);
		int sumr=0;
		for(int i=1;i<=n;i++)
		{
			if(sum==sumr+i)
			{
				System.out.println(i);
				System.out.println("sum:"+ sum+ " sumr :"+sumr);
			}
			sum=sum-i;
			sumr=sumr+i;		
		}
	}
}
