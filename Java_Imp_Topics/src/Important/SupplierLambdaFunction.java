package Important;
/*
 		4. Supplier<R> -------> get()
 		==============================
 			-> Supplier Interface contains get() method. 
 			-> it does not take any value from the user and it will give some value.
 			-> But we need to mention return type.
*/

import java.util.Date;
import java.util.function.*;
class SupplierLambdaFunction
{
	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		
	}
} 