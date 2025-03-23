/*
 -> String s1="JAVA". Here s1 called reference and "JAVA" called Literal.
 -> whenever String concatenation is performed using string literal the new String 
 	is created on the "Constant pool".
 -> Whenever String concatenation is performed using string references the new String
 	is created on the "Non constant pool".
 
 */
package Strings;

public class String_Basics_02 
{
	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="PYTHON";
		String s3="JAVA"+"PYTHON";
		String s4="JAVA"+"PYTHON";
		System.out.println(s3==s4);// true -> i.e References are equal. So created in constant pool where Duplicates are not allowed.
		
		String s5=s1+s2;
		String s6=s1+s2;
		System.out.println(s5==s6); // false -> i.e references are not equals. so created in non constant pool. where Duplicates are allowed.
		
	}
}
