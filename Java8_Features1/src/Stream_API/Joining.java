
/*
 	The Joining method in java Streams Concatenates the elements of a stream into single String with 
 	Optional Delimeters, prefix and suffix.
 	
 	Return Type : String
 */
package Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining 
{
	public static void main(String[] args) 
	{
		// Concatenate all strings in a list into single String with commas, a prefix and suffix;
		List<String> words=Arrays.asList("apple","banana","Cherry");
		String result=words.stream().collect(Collectors.joining(", ","[","]"));
		System.out.println(result);
	}
}
