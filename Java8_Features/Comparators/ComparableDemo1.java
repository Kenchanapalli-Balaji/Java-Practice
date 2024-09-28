package Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int id;String name;int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public int compareTo(Student s)
	{
		return -((Integer)this.age).compareTo(s.age);
	}
}
public class ComparableDemo1 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Balaji", 27);
		Student s2=new Student(2,"Sravani", 14);
		Student s3=new Student(3,"Ramu", 40);
		Student s4=new Student(4,"Vishnu", 4);
		Student s5=new Student(5,"Deekshith", 2);
		List<Student> list=Arrays.asList(s1,s2,s3,s4,s5);
		Collections.sort(list);
		list.stream().forEach(s->System.out.println(s));
	}
}
