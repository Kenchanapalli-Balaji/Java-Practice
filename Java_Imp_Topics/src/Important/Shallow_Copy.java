/*
 -> ShallowCopy stores the references of objects to the original memory Address. 
 -> Shallow copy reflects changes made to the new/copied object in the original object.
 -> Shallow copy stores the copy of the orignal object and points the references to the objects.
 */

package Important;

class Address{
	String city;String state;String country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Customer{
	int cid;String cname;Address add;
	public Customer() {}
	public Customer(int cid, String cname, Address add) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.add = add;
	}
	public Customer(Customer c)
	{
		this.cid= c.cid;
		this.cname=c.cname;
		this.add=c.add;
	}
}
public class Shallow_Copy 
{
	public static void main(String[] args) 
	{
		Address a1=new Address("Bangalore","Karnataka","India");
		Customer c1=new Customer(1,"Raghu",a1);
		Customer c2=c1;
		Customer c3= new Customer(c1.cid,c1.cname,c1.add);
		Customer c4=new Customer();
			c4.cid=c1.cid;
			c4.cname=c1.cname;
			c4.add=c1.add;
		c4.add.city="Mangalore";
		Customer c5=new Customer(c1);
		System.out.println("C1:"+c1);
		System.out.println("C2:"+c2);
		System.out.println("C3:"+c3); // It will print different address of C1 & C2
		System.out.println("C1.add:"+c1.add);
		System.out.println("C3.add:"+c3.add);// The address of C1 & C3 will be same this is called Shallow Copy
		System.out.println("C4:"+c4);
		System.out.println("C5:"+c5);
		System.out.println(a1.city);
		System.out.println(c4.add.city); // Shallow copy will affect in original Object
		
	}
}
