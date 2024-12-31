package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> al= Arrays.asList(10,15,20,25,30,35,40);
		List<Integer> evenlist=new ArrayList<>();
		
///////////////////////////// without using Stream API  ///////////////////////////
		
		/*
		for(int i:al)
		{
			if(i%2==0)
				evenlist.add(i);
		}
		System.out.println(evenlist);
		*/
		
///////////////////////////  With using StreamAPI  ///////////////////////////
		
		
		evenlist=al.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenlist);
		 
		al.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		   // OR //
		System.out.println();
		al.stream().filter(n->n%2==0).forEach(System.out::println);		
	}
}
