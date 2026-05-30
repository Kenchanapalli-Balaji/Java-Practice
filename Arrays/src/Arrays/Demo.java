  package Arrays;

import java.util.*;
class Demo
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(9); list.add(8); list.add(7); list.add(6); list.add(5);
		list.add(4); list.add(3); list.add(2); list.add(1);
		System.out.println(list);
		list.remove(Integer.valueOf(1));
		System.out.println(list);
		
		Integer A = 128; // 127
		Integer B = 128; // 127
		System.out.println(A==B);
	}
	
}