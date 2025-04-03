package Stream_API;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,3,5,7);
		System.out.println(list);
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(n->set.add(n));
		System.out.println(set);
	}
	
}