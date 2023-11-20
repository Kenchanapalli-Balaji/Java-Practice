package Sorting;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Student1 implements Comparable<Student1>
{
	String name;
	int id;
	
	public Student1(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student1 o) 
	{
		
		return this.name.compareTo(o.name);
	}
	
}
public class Map_Comparable 
{
	public static void main(String[] args)
	{
		Map<Student1, String> tm=new TreeMap<>();
		tm.put(new Student1("Balaji",10),"Bangalore");
		tm.put(new Student1("Sravani",5),"Kurlapalli");
		tm.put(new Student1("Sushanth",2),"Kallur");
		tm.put(new Student1("Appu",1),"Hindupur");
		
		Set<Student1> s=tm.keySet();
		for(Student1 std:s)
		{
			System.out.println(std+" --->"+tm.get(std));
		}
	}
}
