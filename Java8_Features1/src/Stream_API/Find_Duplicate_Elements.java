//https://youtu.be/aaokKp87Hoc
package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Duplicate_Elements 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,3,5,7);
		
		// 1st Method using Set
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> uniqueList =list.stream().filter(n->!set.add(n)).collect(Collectors.toList());
		System.out.println("1st method Using Set :\n"+uniqueList);
		
		
		//second method using Collection.frequency
		Set<Integer> uniqueSet=	list.stream().filter(n->Collections.frequency(list,n)>1)
											 .collect(Collectors.toSet());
		System.out.println("Second method using Collections.frequency :\n"+uniqueSet);
		
		
		
		// Third method using Collectors groupingBy
		
	List<Integer> uniqueElements =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					 .entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey)
					 .collect(Collectors.toList());
	System.out.println("3rd method using Grouping By Method :\n"+ uniqueElements);
	
		
		String s="simple codes";
		
		System.out.println("Strings using Set Method :");
		List<Character> characterList=new ArrayList<Character>();
		Set<Character> characterSet=new HashSet<Character>();
		for(char c:s.toCharArray())
			characterList.add(c);
		
		characterList.stream().filter(c->!characterSet.add(c)).forEach(System.out::println);
		
		
		System.out.println("String Using chars() Method: ");
		s.chars().mapToObj(c->(char) c).filter(c->c!=' ')
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(str->System.out.println(str));
			
	
	}
}
