package Strings;
import java.util.*;

/////////////////////////// Approach 1 ////////////////////
class CountCharactersInString
{
	public static void main1(String[] args)
	{
		String st="Balaji Kallur";
		st=st.toLowerCase();

		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

		char[] chars=st.toCharArray();
		System.out.println(chars.toString());
		
		for(Character ch:chars)
		{
			if(hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			
			else if(ch!=' ')//to avoid  white spaces
				hm.put(ch,1);
		}
		
		for(Character ch:hm.keySet())
		{
				System.out.println(ch+"-->"+hm.get(ch));
		}
	}
}

/////////////////////////// Approach 2 ////////////////////

/*
// class Demo {
// 
//  public void countDupChars(String str){
// 
//    //Create a HashMap 
//    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
// 
//    //Convert the String to char array
//    char[] chars = str.toCharArray();
// 
//    /* logic: char are inserted as keys and their count
//     * as values. If map contains the char already then
//     * increase the value by 1
//     */
//    for(Character ch:chars){
//      if(map.containsKey(ch)){
//         map.put(ch, map.get(ch)+1);
//      } else {
//         map.put(ch, 1);
//        }
//    }
// 
//    //Obtaining set of keys
//    Set<Character> keys = map.keySet();
// 
//    /* Display count of chars if it is
//     * greater than 1. All duplicate chars would be 
//     * having value greater than 1.
//     */
//
//    for(Character ch:keys){
//      if(map.get(ch) > 1){
//        System.out.println("Char "+ch+" "+map.get(ch));
//      }
//    }
//  }
// 
//  public static void main(String a[]){
//    Demo obj = new Demo();
//    System.out.println("String: BeginnersBook.com");
//    System.out.println("-------------------------");
//    obj.countDupChars("BeginnersBook.com");
//  
//    
//  }
//}
//
//*/

