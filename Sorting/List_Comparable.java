package Sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Employee implements Comparable<Employee>
{
	int id;String name;double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee anotherEmployee) {
		return ((Double)this.salary).compareTo(anotherEmployee.salary); // Ascending Order
	//return -((Double)this.salary).compareTo(anotherEmployee.salary); //Descending Order
	}
	
}
public class List_Comparable 
{
	public static void main(String[] args) 
	{
		List<Employee> list=new LinkedList<>();
		list.add(new Employee(1,"Balaji",300.43));
		list.add(new Employee(5,"Sravani",39766.43));
		list.add(new Employee(6,"Sushanth",755.43));
		list.add(new Employee(4,"Nandeesh",1332.43));
		list.add(new Employee(2,"Punith",343.875));
		list.add(new Employee(0,null,0));
		
		Collections.sort(list);
		ListIterator<Employee> li=list.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		
//		for(Employee emp:list)
//			System.out.println(emp);
		
	}
}
