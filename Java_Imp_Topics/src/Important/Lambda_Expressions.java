package Important;
/*
 Anonymous Function:-
 	1.It does not have name of the function.
 	2.The function does not have any return type
 	3.It does not have any return value and no access modifiers.
 	Note:-
 		1. lambda Expressions can be invoked only from Functional Interface
 		2. without using Functional Interface we can not use Lambda Expressions(Anonymous Function)
 */
@FunctionalInterface
interface I
{
	// 1. public void fun();
	// 2. void fun(String s,String t);
	
	int fun(int a, int b);
}
public class Lambda_Expressions 
{
	public static void main(String[] args) 
	{
		/*  1.
		 I o=()->System.out.println("Balu");
		o.fun();
		*/
		
		/* 2.
		I o=(s,t)->System.out.println("From "+s+" to "+t);
		o.fun("Hyderabad", "Bangalore");
		*/
		
		
		
	//	I o=(int a, int b)-> a+b;
				// OR //
	//	I o=(a,b)->a*b;
		    // OR //
		 I o=(a,b)->{return a*b;};
		System.out.println(o.fun(5, 5));
	}	
	
}
