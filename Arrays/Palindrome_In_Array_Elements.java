//program to find the PALINDROME numbers in the given ARRAY?
package Arrays.copy;

public class Palindrome_In_Array_Elements 
{
	public static void main(String[] args) 
	{
		int ar[]= {121,123,323,654,343,12,43,878,346};
		for(int i=0;i<ar.length;i++)
		{	
			int temp=ar[i];
			int rev=0;
			while(ar[i]>0)
			{
				rev=(rev*10)+ar[i]%10;
				ar[i]=ar[i]/10;
			}
			if(rev==temp)
				System.out.println(temp);
		}
	}
}
