// https://youtu.be/nUFoDfGl1II
package Important;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private int id; private String name;
	
	public Employee(int id, String name) {
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
	
}
public class Serialization_Example 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		// Serialize
		Employee e=new Employee(1,"Balaji");
		FileOutputStream file=new FileOutputStream("G:\\Learning Projects\\Java Practice\\Java Practice\\Java_Imp_Topics\\src\\Important\\SerializationFile.ser");
		ObjectOutputStream object=new ObjectOutputStream(file);
		object.writeObject(e);
		object.close();
		file.close();
		System.out.println("Successfully Serialized the Employee class");
		
		// Deserialize
		FileInputStream fileInput = new FileInputStream(
				"G:\\\\Learning Projects\\\\Java Practice\\\\Java Practice\\\\Java_Imp_Topics\\\\src\\\\Important\\\\SerializationFile.ser");
		ObjectInputStream inputObject= new ObjectInputStream(fileInput);
		Employee reCreatedObject = (Employee) inputObject.readObject();
		System.out.println("Successfully Deserialized the File");
		System.out.println(reCreatedObject.getName());
		inputObject.close();
		fileInput.close();
				
	}
}
