package Important;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employe
{
	int id; String name;
	
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() 
	{
		//return Objects.hash(id, name);
		
		final int prime = 31;
		int result =1;
		result = prime*result+id;
		result = prime * result +((name==null)? 0:name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
public class HashCode_And_Equals_Demo_1 
{
	public static void main(String[] args) 
	{
		Employe e1=new Employe(1,"Balu");
		Employe e2=new Employe(1,"Balu");
		System.out.println(e1.equals(e2));
		/*
		 Note :
		 ==========
		 1. if we don't override the equals method we will get as false , if the both values are same also.
		 2. But if override the equals method, then we are getting true . as it is comparing the values.
		 */
		Set<Employe> set = new HashSet<Employe>();
		set.add(e1);
		set.add(e2);
		System.out.println(set);
		/*
		 Note :
		 ==============
		 1. here we got the output like below before implementing the hashcode() method  
		 	output : [Employe [id=1, name=Balu], Employe [id=1, name=Balu]]
		 2. By default for every object one unique hashcode will be there in Java, since we have created 2 objects
		 	for EMployee class it considered as two different objects.
		 3. So whenever we overriden the equals() method , then compulsory we need to override the hashcode() method.
		 4. But there is a some contract is there between the hashcode and equals methods. 
		 5. After overriding the hashcode we got the output as like below. 
		 	output: [Employe [id=1, name=Balu]]
		 */
	}
}
