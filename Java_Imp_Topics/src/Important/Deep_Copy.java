/*
  -> Deep Copy is the process of creating exactly the independent duplicate objects in the heap memory 
 		and manually assigning the values of the second object where values are supposed to be copied
 		is called Deep Copy (or) Deep Cloning.
 -> Deep Copy stores the copies of the object's values.
 -> Deep Copy does not reflect changes made to the new object/copied object in the original object.
 -> Deep copy stores the cpy of the original object and recursively copies the objects as well.
 -> 
 */
package Important;

class Address1
{
	String city;String state;String country;

	public Address1(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Customer1
{
	int cid;String cname;Address1 add;
	public Customer1() {}
	public Customer1(int cid, String cname, Address1 add) {
		this.cid = cid;
		this.cname = cname;
		this.add = add;
	}
	public Customer1(Customer1 c)
	{
		this.cid= c.cid;
		this.cname=c.cname;
		this.add=c.add;
	}
}
public class Deep_Copy 
{
	public static void main(String[] args) 
	{
		Address1 add= new Address1("Bangalore","Karnataka","India");
		Customer1 c1=new Customer1(2,"Raghu",add);
		Customer1 c2=c1;
		Customer1 c3=new Customer1(c1.cid,c1.cname,c1.add);
		Customer1 c4=new Customer1();
			c4.cid=c1.cid;
			c4.cname=c1.cname;
			c4.add=new Address1(c1.add.city,c1.add.state,c1.add.country); // Deep Copy
		Customer1 c5=new Customer1(c1);
		System.out.println("C1:"+c1);
		System.out.println("C2:"+c2);
		System.out.println("C3:"+c3);
		System.out.println("c1.add:"+c1.add);
		System.out.println("c4.add:"+c4.add);// Here we will get different address copy's of C1 & C4
		
	}

}
