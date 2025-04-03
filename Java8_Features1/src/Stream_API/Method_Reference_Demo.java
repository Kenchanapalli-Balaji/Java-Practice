package Stream_API;

import java.util.Arrays;
import java.util.List;

class Std
{
	String name;

	public Std(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public String removeSplChars(String s)
	{
		return s.replaceAll("[^a-zA-Z0-9]","");
	}
	
}
public class Method_Reference_Demo 
{
	public static void main(String[] args) 
	{
		Std std=new Std("Balu");
		List<String> names= Arrays.asList("ma##@dan", "al%^*an","","rose",null,"tom","alex@#$(*","Balu");
		/*
		 	-> Given a list of Student names
		 	-> Exclude the empty strings
		 	-> Remove special characters if any 
		 	-> convert to upper case
		 	-> sort it alphabetical order
		 	-> create a Student objects
		 */
		
		names.stream()
						.filter(s->s!=null &&!s.isEmpty())
						
						//.map(s->std.removeSplChars(s))   -> Method reference using an instance Method
						.map(std::removeSplChars)
						
						//.map(s->s.toUpperCase())    -> Method reference using Instance method but for an arbitary object
						.map(String::toUpperCase)
						
						//.sorted((s1,s2)->s1.compareTo(s2))  -> method reference with 2 parameters 1 as target, other as argument
						.sorted(String::compareTo)
						
						//.map(s->new Std(s))     -> method reference using Constructor 
						.map(Std::new).forEach(System.out::println);
			
		
	}
}
