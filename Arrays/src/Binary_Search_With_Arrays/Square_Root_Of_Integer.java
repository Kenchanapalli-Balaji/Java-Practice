// https://youtu.be/Bsv3FPUX_BA
package Binary_Search_With_Arrays;

public class Square_Root_Of_Integer 
{	
	public static void main(String[] args) 
	{
		int n=28;
		int res=0;
		int low=1; int high=n/2;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if((mid*mid)<=n)
			{
				res=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		System.out.println(res);
	}

}
