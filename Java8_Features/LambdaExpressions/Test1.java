 package java8_Features.LambdaExpressions;

public interface Test1 {

	public void m1();
	public static void m2()
	{
		System.out.println("This is static method from Test1 Interface");
	}
	public default void m3()
	{
		System.out.println("This is default method from Test1 Interface");
	}
}
