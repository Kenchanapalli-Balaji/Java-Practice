package Stream_API;

import java.util.Arrays;
import java.util.List;

class Student2
{
	int id; String name; int marks;

	public Student2(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Parallel_Stream_Demo 
{
	public static void main(String[] args) 
	{
		List<Student2> list = Arrays.asList(
				new Student2(1,"Balaji",99),
				new Student2(2,"Ramesh",50),
				new Student2(3,"Rajesh",80),
				new Student2(4,"Rakesh",40),
				new Student2(5,"Vishnu",85),
				new Student2(6,"Deekshith",75)
				);
		//////// Stream - Sequence Stream ///////////////
		System.out.println("Using Sequentcial stream  ");
		list.stream().filter(s->s.marks>=80).limit(3).forEach(System.out::println);
		
		/////////// stream - ParallelStream /////////////
		System.out.println("Using parallel Stream");
		list.parallelStream().filter(s->s.marks>=80).limit(3).forEach(System.out::println);
		
		//////////// Convert stream ---> Parallel stream /////////
		list.stream().parallel().filter(s->s.marks>=80).limit(3).forEach(System.out::println);
		
	}

}
