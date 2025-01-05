/*
 The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones. 
 In other words, In Fibonacci series, next number is the sum of previous two numbers. 
 It usually starting with 0 and 1. The sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.
 */
package numbers;

class Fibonacci
{  
	public static void main(String args[])  
	{    
		int n1=0,n2=1, n3 ,count=10;    
		System.out.print(n1+" "+n2);   
    
		for(int i=2;i<count;i++)    
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}    
  
	}
}  

/*
class Demo
{
	static int fib(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int m=sc.nextInt();
		int f=fib(m);
		System.out.println(f);
	}
}
*/
