// Iterator is used to iterate any collection like List,Set & Queue.
package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_Example 
{
	String name;
	int id, salary;
	public Iterator_Example(String name, int id, int salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Iterator_Example [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	public static void main(String[] args) 
	{
		Collection<Iterator_Example>  emp=new LinkedList<>();
		emp.add(new Iterator_Example("Balaji",1,2000) );
		emp.add(new Iterator_Example("Meena",2,5000));
		emp.add(new Iterator_Example("Sushanth",3,10000));
		emp.add(new Iterator_Example("Sravani",4,50000));
		
		Iterator i=emp.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}
}
