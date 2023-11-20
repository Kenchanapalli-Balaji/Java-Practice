package IEVOVLE.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentDetails 
{
	String name;
	int rollno;
	int age;
	public StudentDetails(String name, int rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
	public static void main(String[] args) 
	{
		ArrayList<StudentDetails> al=new ArrayList<>();
		al.add(new StudentDetails("Balaji",5,26));
		al.add(new StudentDetails("Deekshith",1,3));
		al.add(new StudentDetails("Vishnu",3,5));
		al.add(new StudentDetails("Sushanth",2,10));
		al.add(new StudentDetails("Samarth",4,12));
		al.add(new StudentDetails("Darshan",6,9));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name which you want");
		String name=sc.nextLine();
		int pos=-1;			
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getName().equalsIgnoreCase(name))
				pos=i;
			
		}
		if(pos!=-1)
			System.out.println(al.get(pos));
		else
			System.out.println("No record found with name "+name);
		
	}
}


