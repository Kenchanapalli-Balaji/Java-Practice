package Arrays;

import java.util.Arrays;

public class Exchange 
{
	public static void main(String[] args) 
	{
		int ar[]= {120,20,30,40,55,60,170,80,90,1};
		System.out.println("Before Exchanging Array");
		System.out.println(Arrays.toString(ar));
		
		int n;
		if(ar.length%2==0)
			n=ar.length/2;
		else
			n=(ar.length/2)+1;
		for(int i=0;i<ar.length/2;i++)
		{
			int t=ar[i];
			ar[i]=ar[n+i];
			ar[n+i]=t;
		}
		System.out.println("After Exchanging Array");
		System.out.println(Arrays.toString(ar));
	}
	
}
