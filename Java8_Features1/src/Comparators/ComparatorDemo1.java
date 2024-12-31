package Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;

class Student1
{
	int id;String name;int age;
	public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
class AgeComparator implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2)
	{
		return ((Integer)o1.age).compareTo(o2.age);
	}
}
public class ComparatorDemo1 
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1(1,"Balaji", 27);
		Student1 s2=new Student1(2,"Sravani", 14);
		Student1 s3=new Student1(3,"Ramu", 40);
		Student1 s4=new Student1(4,"Vishnu", 4);
		Student1 s5=new Student1(5,"Deekshith", 2);
		List<Student1> list=Arrays.asList(s1,s2,s3,s4,s5);
		
		AgeComparator ac=new AgeComparator();
		Comparator<Student1> nc = new Comparator<Student1>() {
			
			@Override
			public int compare(Student1 o1, Student1 o2) {
				// return o1.name.compareTo(o2.name);   // Ascending Order
				return o2.name.compareTo(o1.name); // Descending Order
			}
		};
		System.out.println("Sorting by Age");
		Collections.sort(list,ac);
		for(Student1 s:list)
		{
			System.out.println(s);
		}
		System.out.println("//////////////////////////////////////////////////////////////////////");
		System.out.println("Sorting by Name");
		Collections.sort(list,nc);
		for(Student1 s:list)
		{
			System.out.println(s);
		}
	}
}
