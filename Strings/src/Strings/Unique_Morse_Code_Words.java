//leet code 804
/*International Morse Code defines a standard encoding where each letter is mapped 
 	to a series of dots and dashes,as follows: 
 	

	'a' maps to ".-",
	'b' maps to "-...",
	'c' maps to "-.-.", and so on.
	For convenience, the full table for the 26 letters of the English alphabet is given below:

	[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
	"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
	Given an array of strings words where each word can be written as a concatenation 
	of the Morse code of each letter.

	For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", 
	and "-...". We will call such a concatenation the transformation of a word.
	Return the number of different transformations among all words we have.
*/

 
package Strings;

import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words
{
	public static void main(String[] args) 
	{
		String s[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",  
			       "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
			       "-..-","-.--","--.."};
		
		Set<String> set=new HashSet<>();
		String words[] = {"gin","zen","gig","msg"};
		for(int i=0;i<words.length;i++)
		{
			StringBuffer sb=new StringBuffer();
			for(char c:words[i].toCharArray())
			{
				String res=s[c-'a'];
				sb.append(res);
			}
			set.add(sb.toString());
		}
		System.out.println(set);
		System.out.println(set.size());
	}
}
