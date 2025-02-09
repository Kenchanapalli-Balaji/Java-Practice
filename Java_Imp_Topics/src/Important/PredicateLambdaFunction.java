package Important;
/*
1. Predicate<T> ------> test()
 		==============================
 			-> In Predicate Interface it contains only one method i.e test() & it returns only boolean value.
 			-> it takes only one Argument and it returns true or false.
 			-> whenever we have some validations then we can invoke test() method.

 */

import java.util.function.Predicate;
class PredicateLambdaFunction
{
	public static void main(String[] args) {
		int a[]= {20,25,34,54,56,60,65,70,75,80};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate <Integer> p2=i->i>50;
		
		System.out.println("These numbers are even AND > 50");
		
		for(int i=0;i<=a.length-1; i++)
		{
			if(p1.and(p2).test(a[i])) // if(p1.test(a[i] && p2.test(a[i])))
			{
				System.out.println(a[i]);
			}
		}


		System.out.println("These numbers are even OR >50");

		//for(int i=0;i<=a.length-1; i++)
		for(int n:a)
		{
			if(p1.or(p2).test(n))   //if(p1.test(n) || p2.test(n))
			{
				System.out.println(n);
			}
		}
	}
}