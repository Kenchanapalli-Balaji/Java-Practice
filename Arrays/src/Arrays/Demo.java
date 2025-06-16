package Arrays;
import java.util.*;

class Demo
{
	public static void main(String[] args) 
	{
		int[] arr= {100, 4, 200, 1, 3, 2};
		
		Set<Integer> set=new HashSet<Integer>();
		for(int n:arr)
			set.add(n);
		System.out.println(set);
	}
	 
}

