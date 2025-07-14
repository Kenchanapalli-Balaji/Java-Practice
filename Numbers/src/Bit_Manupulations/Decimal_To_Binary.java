package Bit_Manupulations;

public class Decimal_To_Binary 
{
	public static void main(String[] args) 
	{
		int n=10;
		StringBuilder sb=new StringBuilder();
		while(n!=0)
		{
			sb.append(n%2);
			n=n/2;
		}
		System.out.println(sb.reverse().toString());
	}
}
