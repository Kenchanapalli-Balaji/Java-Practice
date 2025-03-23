package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emp 
{
	int id; String name; int age; int marks;


	public Emp(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
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


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1, "Balaji", 29, 92);
		Emp e2 = new Emp(2, "Sushanth",11,  95);
		Emp e3 = new Emp(3, "Vishnu", 32,  85);
		Emp e4 = new Emp(4, "Deekshith", 15,  35);
		Emp e5 = new Emp(5, "Samarth", 20, 58);
		List<Emp> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		list.stream().filter(e->e.age%2==0).map(e->e.marks+100).forEach(e->System.out.println(e));
	
	}
	
}
