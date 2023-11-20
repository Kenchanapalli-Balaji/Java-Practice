package Numbers;
class Lcm_Gcd
{
	public static void main(String args[])
	{
		int n1=72; int n2=120; int gcd=0;
		int min=0;
		if(n1<n2)
			min=n1;
		else
			min=n2;
		for(int i=min;i>=1;i--)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
				break;
			}
		}
			
		int lcm=(n1*n2)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
