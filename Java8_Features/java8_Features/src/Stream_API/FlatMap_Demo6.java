package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Demo6 
{
	public static void main(String[] args) 
	{  
		//////////////////// Map  ///////////////////
		
		List<Integer> li=Arrays.asList(1,2,3,4,5,6);
	  //li.stream().map(i->i+10).forEach(System.out::println);
		List<Integer> res=li.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(res);
		
		////////////////// flatmap ////////////////
		
		List<Integer> l1=Arrays.asList(1,2);
		List<Integer> l2=Arrays.asList(3,4);
		List<Integer> l3=Arrays.asList(5,6);
		
		List<List<Integer>> finallist=Arrays.asList(l1,l2,l3);
		System.out.println(finallist);
		List<Integer> result=finallist.stream().flatMap(l->l.stream().map(i->i+10)).collect(Collectors.toList());
		System.out.println(result);
	}
}
