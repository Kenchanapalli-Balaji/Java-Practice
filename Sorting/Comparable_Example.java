package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student>
{
	String name;
	int rollno;
	int age;
	public Student(String name, int rollno, int age) 
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}

	@Override
	public  int compareTo(Student st)
	{
		return ((Integer)this.rollno).compareTo(st.rollno);
//		if(this.rollno==st.rollno)
//			return 0;
//		else if(this.rollno>st.rollno)
//			return 1;
//		else
//			return -1;
	}
	
}
public class Comparable_Example 
{
	public static void main(String[] args) 
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("Balaji",5,25));
		list.add(new Student("Sravani",2,13));
		list.add(new Student("Sushanth",1,8));
		list.add(new Student("Samarth",4,11));
		list.add(new Student("Pandu",3,12));
		
		Collections.sort(list);
		
		Iterator<Student> itr=list.iterator();//Using Iterator
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
//		for(Student st:list)
//		{
//			System.out.println(st);
//		} 
	}
	
}
