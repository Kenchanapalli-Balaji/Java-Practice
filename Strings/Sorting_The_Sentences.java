//leetcode 1859
package Strings.copy;

public class Sorting_The_Sentences 
{
	public static void main(String[] args) 
	{
		String s = "is2 sentence4 This1 a3";
		String arr[]=s.split("\\s");
		String res[]=new String[arr.length];
		int i=0;
		for(String st:arr)
		{
			res[st.charAt(st.length()-1)-'1']=st.substring(0,st.length()-1);
		}
		System.out.println(String.join(" ", res));
	}
}
