/*
	 		3. Consumer<T> -------> accept()
 		=================================
 			-> Consumer Interface contains only one method i.e accept()
 			-> Consumer interface will take one argument but it does not return any value.
*/

import java.util.ArrayList;
import java.util.function.*;
class Demo
{
	String name;
	int sal;
	int age;
	Demo(String name, int sal, int age)
	{
		this.name=name;
		this.sal=sal;
		this.age=age;
	}
	public static void main(String[] args) 
	{
		ArrayList<Demo> al=new ArrayList();
		al.add(new Demo("Balaji",30000,25));
		al.add(new Demo("Meena",50000,23));
		al.add(new Demo("Sravani",20000,10));
		al.add(new Demo("Sushanth",70000,7));
		al.add(new Demo("Vishnu",10000,3));
		
		Function<Demo,Integer> f=s->(s.sal*10)/100;
		Predicate<Integer> p=t->t>3000;
		Consumer<Demo> c=u->System.out.println(u.name);
		
		for(Demo i:al)
		{
			if(p.test(f.apply(i)))
				c.accept(i);
		}
	}
} 

/*
for(Demo i:al)
{
	int bonus=f.apply(i);
	if(p.test(bonus))
	{
		c.accept(i);
		System.out.println(bonus);
	}
}
*/
