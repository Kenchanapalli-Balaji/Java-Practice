import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Student implements  Comparable<Student>
{
	String name;
	Integer rollno;
	Integer age;
	public Student(String name, Integer rollno, Integer age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
	public int compareTo(Student st)
	{
		if(this.rollno==st.rollno)
			return 0;
		else if(this.rollno>st.rollno)
			return 1;
		else
			return -1;
	}
	
			// OR //
	/*
	public int compareTo(Student st)
	{
		return (this.rollno.compareTo(st.rollno)); //Ascending order
		//return -(this.rollno.compareTo(st.rollno)); //Descending order
	}
	*/
}
public class Comparable_Example 
{
	public static void main(String[] args) 
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("Balaji",5,26));
		list.add(new Student("Sushanth",4,10));
		list.add(new Student("Samarth",10,12));
		list.add(new Student("vishnu",2,4));
		list.add(new Student("Dekshith",1,2));
		Collections.sort(list);
		for(Student i:list)
		{
			System.out.println(i);
		}
					// OR //
		/*
		ListIterator<Student> li= list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		*/
	}
}
