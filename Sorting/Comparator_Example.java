package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student_Details
{
	String name; int id;int age;

	public Student_Details(String name, int id, int age) 
	{
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "Student_Details [name=" + name + ", id=" + id + ", age=" + age + "]";
	}	
}

class AgeComparator implements Comparator<Student_Details>
{
	
	@Override
	public int compare(Student_Details o1, Student_Details o2)
	{
//		if(o1.age==o2.age)
//			return 0;
//		else if(o1.age>o2.age)
//			return 1;
//		else
//			return -1;
		return ((Integer)o1.age).compareTo(o2.age);
		
		//return o1.age-o2.age;
		
	}
	
}

class NameComparator implements Comparator<Student_Details>
{

	@Override
	public int compare(Student_Details o1, Student_Details o2) 
	{
		return o1.name.compareTo(o2.name);
	}
	
}
public class Comparator_Example 
{
	public static void main(String[] args) 
	{
		List<Student_Details> list=new ArrayList<>();
		list.add(new Student_Details("Balaji",1,25));
		list.add(new Student_Details("Sravani",4,10));
		list.add(new Student_Details("Sushanth",3,9));
		list.add(new Student_Details("Bhargav",9,24));
		
		AgeComparator agc=new AgeComparator();
		NameComparator nc=new NameComparator();
		
		System.out.println("Sorting By Age");
		Collections.sort(list, agc);
		for(Student_Details s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("Sorting By Name");
		Collections.sort(list, nc);
		for(Student_Details s:list)
		{
			System.out.println(s);
		}
	}
}
