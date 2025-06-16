package Important;

class A
{
	A(){
		this("Constructor");
		System.out.println("Default Constructor from A class");
	}
	A(String s)
	{
		System.out.println("Param Constructor from A Class");
	}
}
public class Constructor_Example_01 extends A
{
	 Constructor_Example_01() {
		this("Constructor");
		System.out.println("Default Constructor from main class");
	}
	 Constructor_Example_01(String s){
		 System.out.println("Param Constructor from main Class");
	 }
	 public static void main(String[] args) {
		Constructor_Example_01 obj=new Constructor_Example_01();
	}
	
}
