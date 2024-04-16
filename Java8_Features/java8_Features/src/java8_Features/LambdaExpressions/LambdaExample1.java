package java8_Features.LambdaExpressions;

public class LambdaExample1  
{
	 public static void main(String[] args) 
	 {
		Test2 t=(x,y)->System.out.println(x+y);
		t.add(10, 10);
	 }
}
