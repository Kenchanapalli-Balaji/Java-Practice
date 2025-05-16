package Stream_API;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo
{
	
	public static void main(String[] args) 
	{
		String s="malayalamm";
	Boolean res=IntStream.range(0, s.length()/2).allMatch(c->s.charAt(c)==s.charAt(s.length()-1-c));
	System.out.println(res);
	}
	
}