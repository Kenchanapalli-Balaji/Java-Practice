package LambdaExpressions;
@FunctionalInterface
interface AB
{
	void add(int a, int b);
}
public class Addition 
{
	public static void main(String[] args) {
		
		AB obj=(a,b)->System.out.println(a+b);
		obj.add(10, 20);
	}	
}
 