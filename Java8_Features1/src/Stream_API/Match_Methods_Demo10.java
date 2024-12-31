package Stream_API;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//anyMatch()
//allMatch()
//noneMatch()
public class Match_Methods_Demo10 
{
	public static void main(String[] args) 
	{
		Set<String> fruits=new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Guava");
		
		boolean hasFruitStartingWithG = fruits.stream().anyMatch(v-> { return v.startsWith("G");});
		System.out.println("Is there any fruit starting with 'G'? " + hasFruitStartingWithG);
		fruits.stream().filter(f->f.startsWith("G")).forEach(System.out::println);
	}
}
