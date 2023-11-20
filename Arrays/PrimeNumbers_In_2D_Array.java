package Arrays.copy;

public class PrimeNumbers_In_2D_Array 
{
	public static void main(String[] args) 
	{
		int ar[][]= {
						{1,2,3,4,6,7,8,9},
						{10,11,12,13,14,15}
					};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				boolean res=true;
				for(int k=2;k<=ar[i][j]/2;k++)
				{
					if(ar[i][j]%k==0)
					{
						res=false;
						break;
					}
				}
				if(res)
					System.out.println(ar[i][j]);
			}
		}
	}
}
