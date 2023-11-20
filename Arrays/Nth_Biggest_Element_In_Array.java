package Arrays.copy;

public class Nth_Biggest_Element_In_Array 
{
	public static void main(String[] args) 
	{
		int ar[]= {10,30,20,40,60,50,70,90,80};
		int res=getBiggest(ar,7);
		System.out.println(res);
	}
	public static int getBiggest(int []ar, int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
				return ar[i];
		}
		return 0;
	}
}
