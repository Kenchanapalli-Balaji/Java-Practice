/*
 ->  A class that implements the Cloneable interface indicates that it is legal for clone() method 
   to make a field-for-field copy of instances of that class.
 -> Object.clone() method is used to create the Deep Copy of the object.
 -> Deep copy is the creating the same instance with the same values but if we done any changes in new instance it will not
  	then it will not affect in original Object.
 */
package Important;

public class Clonable_Example implements Cloneable
{
	int id; String name;
	public Clonable_Example(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Clonable_Example o1=new Clonable_Example(1,"Balaji");
		Clonable_Example o2= (Clonable_Example) o1.clone();
		System.out.println(o1);
		System.out.println(o2);
		o2.name="Balu";
		System.out.println(o1.name);
		System.out.println(o2.name);
	}
}
