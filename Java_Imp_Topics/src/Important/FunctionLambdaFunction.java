package Important;
/*
	2. Function<T,R> -----> apply()s
 		===============================
 		-> Functional Interface cantains only one method i.e apply()
 		-> apply() method can accept any type data and it will return single value/type.
 		-> if we want to do operations and get the value then we have to go for this interface.
*/

import java.util.function.Function;
import java.util.*;
class FunctionLambdaFunction
{
	String ename;
	int sal;
	FunctionLambdaFunction(String ename, int sal)
	{
		this.ename=ename;
		this.sal=sal;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		
		ArrayList<FunctionLambdaFunction> al=new ArrayList();

		al.add(new FunctionLambdaFunction("Balaji",15000));
		al.add(new FunctionLambdaFunction("Meena",25000));
		al.add(new FunctionLambdaFunction("Sravani",22389));
		al.add(new FunctionLambdaFunction("Sushanth",18765));
		
		Function<FunctionLambdaFunction,Integer> f=d->
		{
			if(d.sal>=10000 && d.sal<=20000)
				return (d.sal*10/100);
			else if(d.sal>20000 && d.sal<=30000)
				return (d.sal*20/100);
			else
				return (d.sal*30/100);
			
		};
		for (FunctionLambdaFunction i:al)
		{
			System.out.println(i.ename+ " ----> Bonus ---->" + f.apply(i));
		}
		
	}
}


// Merging Predicate and Function Interfaces


/*
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;
class Demo
{
	String ename;
	int sal;
	Demo(String ename, int sal)
	{
		this.ename=ename;
		this.sal=sal;
	}
	
	public static void main(String[] args)
	{
		
		ArrayList<Demo> al=new ArrayList();
		al.add(new Demo("Balaji",45000));
		al.add(new Demo("Meena",30000));
		al.add(new Demo("Sravani",22389));
		al.add(new Demo("Sushanth",18765));
		
		Function<Demo,Integer> f=d->
		{
			if(d.sal>=10000 && d.sal<=20000)
				return (d.sal*10/100);
			else if(d.sal>20000 && d.sal<=30000)
				return (d.sal*20/100);
			else
				return (d.sal*30/100);
			
		};
		
		
		Predicate<Integer> p=b->b>5000;
		
		for (Demo i:al)
		{
			if(p.test(f.apply(i)))
			{
				System.out.println(i.ename+ " ----> Bonus ---->" + f.apply(i));
			}
		
		}
		
	}
}
*/

