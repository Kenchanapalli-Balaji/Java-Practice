/*
 Strings are Immutable :
 ================================
 
 -> Strings created using String class are immutable in nature and once initialized can not be modified.
 -> When an immutable String is attempted to be modified a brand new String is created.
 */
package Strings;

public class String_Basics_03 
{
	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="PYTHON";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1.concat(s2); // String can not be changed
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s1.concat(s2); // String can be changed but new Object(String) Created as compare to previous s1.
		System.out.println(s1);
		System.out.println(s1.hashCode()); // you can compare the hashcodes of the previous s1 and present s1.
		System.out.println(s2.hashCode());
	}

}
