package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 
{
	
	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("Apple",null,"Ball","Cat",null,"Dog","Elephant","Fog");
		List<String> result=words.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(result);
	}
}
