//List iterator can only used to iterate List but not certain Queue & Set.
package Collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator 
{
	String name; 
	int id;
	int salary;
	public List_Iterator(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "List_Iterator [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) 
	{
		ArrayList<List_Iterator> al=new ArrayList<List_Iterator>();
		al.add(new List_Iterator("Balaji",1,20000));
		al.add(new List_Iterator("Meena",2,1000));
		al.add(new List_Iterator("Deekshith",3,40000));
		al.add(new List_Iterator("Vishnu Vardhan",4,50000));
		
		ListIterator<List_Iterator> litrFwd=al.listIterator();
		System.out.println("forward Direction");
		while(litrFwd.hasNext())
			System.out.println(litrFwd.next());
		
		ListIterator<List_Iterator> litrBkw=al.listIterator(al.size());
		System.out.println("Backward Direction");
		while(litrBkw.hasPrevious())
			System.out.println(litrBkw.previous());
		
	}
	
}
