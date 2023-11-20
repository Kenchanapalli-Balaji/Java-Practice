package Numbers;
import java.util.Scanner;

public class Binary_To_Decimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(decimalToBinary(n));
		String s=decimalToBinary(n);
		System.out.println(binaryToDecimal(s));
		
	}
	
	static String decimalToBinary(int n)
	{
		String b="";
		while(n>=1)
		{
			int x=n%2;
			b=x+b;
			n=n/2;
		}
		return b;
	}
	static int binaryToDecimal(String b)
	{
		int res=0;
		int powOf2=1;
		for(int i=b.length()-1;i>=0;i--)
		{
			if(b.charAt(i)=='1')
				res+=powOf2;
			powOf2=powOf2*2;
		}
		return res;
	}
}
