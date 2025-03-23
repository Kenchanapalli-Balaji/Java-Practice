package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo4 
{
	public static void main(String[] args) 
	{
		List<String> vehicles=Arrays.asList("Car","Bike","Bus","Zeep","Airoplane","Lorry");
		vehicles.stream().map(v->v.toUpperCase()).forEach(v->System.out.println(v));
		//vehicles.stream().map(v->v.length()).forEach(System.out::println);
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);
		l.stream().map(i->i*2).forEach(System.out::println);
		List<Integer> result=l.stream().map(i->i*3).collect(Collectors.toList());
		System.out.println(result);
	}
}
