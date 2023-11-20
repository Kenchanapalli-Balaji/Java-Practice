package Arrays.copy;

public class Missing_Number_In_Array 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,6,7,8};
		int n=ar.length+1;
		// int n=ar.length; // if 0 Presents in given array
		int sum=n*(n+1)/2;
		for(int num=0;num<ar.length;num++)
		{
			sum=sum-ar[num];
		}
		System.out.println("Missing Number is : "+sum);
	}
}
