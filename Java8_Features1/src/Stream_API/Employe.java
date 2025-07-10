package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employe 
{
	int id; String name;int age; String department; int sal;

	public Employe(int id, String name, int age, String department, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", sal=" + sal
				+ "]";
	} 
	public static void main(String[] args)
	{
		Employe e1 = new Employe(1, "Balaji", 29, "sales", 52000);
		Employe e2 = new Employe(2, "Sushanth",11, "sales", 42000);
		Employe e3 = new Employe(3, "Vishnu", 32, "loans", 58000);
		Employe e4 = new Employe(4, "Deekshith", 15, "loans", 35000);
		Employe e5 = new Employe(5, "Samarth", 20, "sales", 58000);
		List<Employe> list= Arrays.asList(e1,e2,e3,e4,e5);
//		List<Employe> filteredList=list.stream().filter(e->e.getDepartment().equals("sales") && e.getSal()>50000)
//					 .collect(Collectors.toList());
//		for(Employe e : filteredList)
//			System.out.println(e);
		
		// Optional<Employe> emp = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employe::getSal)));
	   Optional<Employe> emp = list.stream().max(Comparator.comparing(Employe::getSal));
		System.out.println("Higest Salary: "+ emp.get());
		
		Optional<Employe> e = list.stream().collect(Collectors.minBy(Comparator.comparing(Employe::getSal)));
		System.out.println("Lowest Salary : "+ e.get());
		
		List<Employe> sortedList1 = list.stream().sorted(Comparator.comparingInt(s->s.age)).toList();
		System.out.println("Ascending Order Based on Age: ");
		for( Employe c : sortedList1)
		{
			System.out.println(c);
		}
		
		List<Employe> sortedList2 = list.stream()
										.sorted(Comparator.comparingInt(Employe::getAge).reversed()).toList();
		System.out.println("Descending Order Based on Age: ");
		for( Employe c : sortedList2)
		{
			System.out.println(c);
		}
		
		// Finding the second highest salary using Stream API
		Optional<Employe> secondHigestSalary = list.stream()
										.sorted(Comparator.comparing(Employe::getSal)
										.reversed())
										.distinct()
										.skip(2)
										.findFirst();
		secondHigestSalary.ifPresent(s->System.out.println("Second Highest Salary :"+s));
		
		// Grouping the Employee class by Department
		
			System.out.println(" Groping the Employee class by Department");
			list.stream().collect(Collectors.groupingBy(Employe::getDepartment))
			.entrySet().stream().forEach(ee->System.out.println(ee.getKey()+"-->"+ee.getValue()));
	}
}
