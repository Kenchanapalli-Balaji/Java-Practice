package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee
{
	int id;String name; int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Filter_Map_Demo5
{
	public static void main(String[] args) 
	{
		List<Employee> emps=Arrays.asList(
				new Employee(1,"Balaji",12000),
				new Employee(2,"Meena",16000),
				new Employee(3,"Susanth",19000),
				new Employee(4,"Deekshith",22000),
				new Employee(5,"Vishnu",32000)
				);
		emps.stream().filter(e->e.salary>20000).map(e->e.salary+1).forEach(System.out::println);
		///////////// Printing along with Employee Details//////////////
		emps.stream().filter(e->e.salary>20000)
					  .map(e->new Employee(e.id, e.name,e.salary+1)).forEach(System.out::println);
		
	}
}
