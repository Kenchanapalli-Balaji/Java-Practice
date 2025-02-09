package Important;
/*
 -> Functional Interface must have only one abstract method and it can have any
 	number of default and static methods. 
 	Examples: 1. Runnable-> run()
 			2. Comparable -> compareTo()
 -> Lambda Expressions can be invoked only from Functional Interfaces.
 -> without using functional Interfaces we can not use lambda expressions.
 -> we have 4 pre-defined Functional Interfaces in java. 
 		1. Predicate<T> ------> test()
 		==============================
 			-> In Predicate Interface it contains only one method i.e test() & it returns only boolean value.
 			-> it takes only one Argument and it returns true or false.
 			-> whenever we have some validations then we can invoke test() method.	
 		2. Function<T,R> -----> apply()
 		===============================
	 		-> Functional Interface cantains only one method i.e apply()
	 		-> apply() method can accept any type data and it will return single value/type.
	 		-> if we want to do operations and get the value then we have to go for this interface.
 		3. Consumer<T> -------> accept()
 		=================================
 			-> Consumer Interface contains only one method i.e accept()
 			-> Consumer interface will take one argument but it does not return any value.
 		
 		4. Supplier<R> -------> get()
 		==============================
 			-> Supplier Interface contains get() method. 
 			-> it does not take any value from the user and it will give some value.
 			-> But we need to mention return type.
 */
@FunctionalInterface
interface I1
{
	void fun();
}

@FunctionalInterface
interface I2
{
	void fun(String s, String t);
}

@FunctionalInterface
interface I3
{
	int fun(int a, int b);
}

public class Functional_Interface 
{
	public static void main(String[] args) 
	{
		I1 o = ()->System.out.println("Testing Interface");
		o.fun();
		
		I2 o2 = (s,t)->System.out.println("From "+ s+" to "+ t);
		o2.fun("Hyderbad","Bangalore");
		
		// I3 o3 = (a,b)->a*b;
		// I3 o3 = (int a, int b) -> a*b;
		   I3 o3 = (a,b)->{ return a*b;};
		
		System.out.println(o3.fun(3, 3));
	}

}
