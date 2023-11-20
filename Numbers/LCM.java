package Numbers;

public class LCM 
{
	public static void main(String[] args) 
	{
		int a=12,b=80;
		int res=Math.max(a, b);
		while(true)
		{
			if(res%a==0 && res%b==0)
				break;
			res++;
		}
		System.out.println(res);
		 
	}
}
