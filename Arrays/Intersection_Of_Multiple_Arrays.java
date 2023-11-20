package Arrays.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Intersection_Of_Multiple_Arrays 
{
	public static void main(String[] args) 
	{
		int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		Map<Integer,Integer> hm=new HashMap<>();
		for(int[] i:nums)
		{
			for(int j:i)
			{
				 int n=j;
	               if(hm.containsKey(n))
	                    hm.put(n,hm.get(n)+1);
	                else
	                    hm.put(n,1);
			}
		}
		int n=nums.length;
		List<Integer> res=new ArrayList();
		for(int i:hm.keySet())
		{
			if(hm.get(i)==n)
				res.add(i);
		}
		Collections.sort(res);
		System.out.println(res);
	}
}
