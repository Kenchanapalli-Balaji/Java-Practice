package numbers;
class Factorial
{
	static int fun(int n)
	{
		//int output;
		if(n==1)
			return 1;
		else
			return fun(n-1)*n;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(fun(5));
	}
}

/*public class Demo 
{      
public static void main(String[] args) 
{
	int n=5;
	int fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	System.out.println(fact);
}
}
*/