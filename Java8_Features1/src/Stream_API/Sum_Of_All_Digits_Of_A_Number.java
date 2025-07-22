package Stream_API;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Of_All_Digits_Of_A_Number 
{
	public static void main(String[] args) 
	{
		int n=153;
		// sum of all digits in given number
		int res=Stream.of(String.valueOf(n).split(""))
					  .collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(res);
	}
}
