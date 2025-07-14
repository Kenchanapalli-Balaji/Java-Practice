package Bit_Manupulations;

public class Swap_Two_Numbers 
{
	public static void main(String[] args) 
	{
		int a=4;
		int b=5;
		a=a^b;  // a=1;
		b=a^b; // (a^b)^b=a 
		a=a^b; // (a^b)^b ==> (a^b)^a== b;
		System.out.println(a);
		System.out.println(b);
	}
}
