package java8_Features.LambdaExpressions;
/*
 * Note :
 * 1. m2() method present in interface and class are different , its not overridded.
 * 2. we cannot override static methods present in interface.
 * 3. we can override default methods present in interface
 */
public class A implements Test1
{
	@Override
	public void m1() {
		System.out.println("Overridden m1 method in A class");
		
	}
	static void m2()
	{
		System.out.println("This is static method from class A");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		Test1.m2(); // calling static method from interface
		a.m3(); // calling default method from the interface
		A.m2();// calling static method present in class A
		

	}
}
