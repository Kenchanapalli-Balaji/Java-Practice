package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	int id;String name; char grade;
	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
}
public class Faltmap_Demo7 
{
	public static void main(String[] args) 
	{
		List<Student> studentlist1=Arrays.asList(
				new Student(1,"Balaji",'A'),
				new Student(2,"Sushanth",'B'),
				new Student(3,"Sravani",'A')
				);
		List<Student> studentlist2=Arrays.asList(
				new Student(4,"Deekshith",'A'),
				new Student(5,"Vishnu",'C'),
				new Student(6,"Nandeesh",'B')
				);
		List<List<Student>> students=Arrays.asList(studentlist1,studentlist2);
		
		////// Before Java8/Without using StreamAPI  ///////
		
		/*
		for(List<Student> s:students)
		{
			for(Student std:s)
			{
				System.out.println(std);
			}
		}
		*/
		
		//////// After java8/ Using StreamAPI(fltmap) ///////
	    List<Student> res=students.stream().flatMap(s->s.stream()).collect(Collectors.toList());
	    System.out.println(res);
		students.stream().flatMap(s->s.stream().filter(std->std.grade=='A')).forEach(System.out::println);
		
		
	}
}
