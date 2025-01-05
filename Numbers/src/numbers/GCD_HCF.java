package numbers;

public class GCD_HCF 
{
	//Approach 1
	/*
	public static void main(String[] args) 
	{
		int a=20,b=15;
		int min=0;
		if(a<b)
			min=a;
		else
			min=b;
		for(int i=min;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println("GCD or HCF is "+i);
				break;
			}
		}
	}
	*/
	//----------------------------------------------------------------
	//Aproach 2 :- 
	//Algorithm : 
	// 1. Find the larger number
	// 2. Replace the larger number by the diff b/w the larger & smaller number
	// 3. Repeat step 1&2 until both numbers are become equal
	// 4. return anu number whichis GCD.
	
	/*
	public static void main(String[] args) 
	{
		int a=20,b=15;
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.println("GCD or HCF" +a); //or System.out.println(b);
		
	}
	*/
	
	//----------------------------------------------------------------------
	// Approach 3
	public static void main(String[] args)
	{
		int a=20, b=15;
		while(a!=0 && b!=0)
		{
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			System.out.println(a);
		else
			System.out.println(b);
	}
}
