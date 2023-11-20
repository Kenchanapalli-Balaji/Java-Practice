class Demo1
{
	public void m1()
	{
		System.out.println("From Demo1 Class");
	}
}
public class TestClass extends Demo1
{
	public void m2()
	{
		System.out.println("From TestClass class");
	}
	public static void main(String[] args)
	{
		Demo1 d=new TestClass(); //Generilzation or Up-casting
		TestClass t=(TestClass) d;// specialization or Down-Casting
		t.m1();
		t.m2();
		
	}
}
