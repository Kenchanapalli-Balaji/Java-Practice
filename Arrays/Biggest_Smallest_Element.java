package Arrays.copy;

public class Biggest_Smallest_Element 
{
	public static void main(String[] args)
	{
		int ar[]= {120,20,30,40,55,60,170,80,90,1};
		int big=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		
		System.out.println("Big Element is :"+big);
		System.out.println("Small ELement is :"+small);
	}
}
