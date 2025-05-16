package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Numbers_Starting_With 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(12,21,13,31,14,41,44,45,15,167,61,168,1000);
	List<Integer> list2=	list.stream().filter(n->String.valueOf(n).startsWith("1"))
			.collect(Collectors.toList());
	System.out.println(list2);
	}
}
