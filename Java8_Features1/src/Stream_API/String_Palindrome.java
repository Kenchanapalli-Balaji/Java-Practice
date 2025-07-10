package Stream_API;

import java.util.stream.IntStream;

public class String_Palindrome 
{
	public static void main(String[] args) {
		String s="Malayalam";
		 String str=s.toLowerCase();
		
	Boolean res=IntStream.range(0, str.length()/2)
			.allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
	System.out.println(res);
	}
}
