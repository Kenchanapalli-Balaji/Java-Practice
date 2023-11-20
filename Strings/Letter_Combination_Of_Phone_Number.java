//https://youtu.be/1TGTBDWY1s4
//leetcode 17
package Strings.copy;
public class Letter_Combination_Of_Phone_Number 
{
	static String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) 
	{
		String digits="234";
		fun(digits,"");
	}
	public static void fun(String s, String ans)
	{
		if(s.length()==0)
		{
			System.out.println(ans);
			return;
		}
		String key=arr[s.charAt(0)-48];
		// System.out.println("key  "+key);
		for(int i=0;i<key.length();i++)
		{
			fun(s.substring(1),ans+key.charAt(i));
		}
	}
}
