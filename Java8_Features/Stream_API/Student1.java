package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student1 
{
	Integer id; String name; int age; String school;

	public Student1(Integer id, String name, int age, String school) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	public static void main(String[] args) 
	{
		Student1 s1=new Student1(1, "Balaji", 28, "Kallur ZPHS");
		Student1 s2=new Student1(2, "Sushanth", 10, "Kondur ZPHS");
		Student1 s3=new Student1(3, "Vishnu", 5, "Utakur");
		Student1 s4=new Student1(4, "Deekshith",3, "Play School");
		List<Student1> list=Arrays.asList(s1,s2,s3,s4);
		List<Student1>	res=list.stream().sorted(Comparator.comparingInt(s->s.age)).toList();
		System.out.println(res);
	}
	

}
