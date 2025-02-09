package Arrays;
import java.util.HashMap;

class Count_PrimeNumbers_In_Array
{
	public static void main(String[] args) 
	{
		int arr[]= {3,4,5,6,7,8,9,11,13,15,16};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{	
			boolean isPrime=true;
			for(int j=2;j<=arr[i]/2;j++)
			{
				if(arr[i]%j==0)
				{
					isPrime=false;
					break;	
				}
			}
			if(isPrime)
			{
				count++;
				System.out.println(arr[i]);
			}
				
		}
		System.out.println("no of Prime Numbers  "+count);
	}
}