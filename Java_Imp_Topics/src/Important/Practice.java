package Important;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Practice implements Serializable
{
	int id; String name; int age;

	public Practice(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Practice [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) throws IOException , ClassNotFoundException
	{
		Practice d = new Practice(1,"Balaji",27);
		FileOutputStream file = new FileOutputStream("G:\\Learning Projects\\Java Practice\\Java Practice\\Java_Imp_Topics\\src\\Important\\SerializationFile.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
		objectOutputStream.writeObject(d);
		objectOutputStream.close();
		file.close();
		System.out.println("Successfully Created the Serialized file");
	}
}
