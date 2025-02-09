package Arrays;

public class First_Big_Second_Big 
{
	public static void main(String[] args) 
	{
		int ar[]= {120,20,30,40,55,60,170,80,90,1};
		int fbig=ar[0];
		int sbig=ar[1];
		for(int i=1;i<ar.length;i++)
		{
			if(fbig<ar[i])
			{
				sbig=fbig;
				fbig=ar[i];
			}
			else if(sbig<ar[i]&&ar[i]!=fbig)
				sbig=ar[i];
		}
		System.out.println("First Big Element is :"+fbig);
		System.out.println("Second Big Element is :"+sbig);
	}
}
