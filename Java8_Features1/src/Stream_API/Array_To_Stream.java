package Stream_API;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Array_To_Stream 
{
	public static void main(String[] args) 
	{
		int arr[] ={1, 2, 5, 5, 6, 6, 7, 2};
		Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(n->n,Collectors.counting()))
		.forEach((key,value)->System.out.println(key+"-->"+value));
	}
}
