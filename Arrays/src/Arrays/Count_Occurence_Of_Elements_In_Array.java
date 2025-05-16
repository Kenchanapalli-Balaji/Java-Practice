package Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.*;

class Count_Occurence_Of_Elements_In_Array
{
	public static void main(String[] args) 
	{
		int arr[]= {1,3,4,5,5,3,4,8,1};
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			hm.put(i, hm.getOrDefault(i,0)+1);
		}
		
		for(int i:hm.keySet())
		{
			System.out.println("  "+i+ "  no of time occurs :" +hm.get(i));
		}
		
	}
}