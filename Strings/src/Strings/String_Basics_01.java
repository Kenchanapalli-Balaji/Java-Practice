/*
 -> Strings in java are series of characters enclosed within double quoates (" ").
 -> Strings are treated as objects in java.
 -> Strings are divided into two types
 		1) Mutable or changeable Strings
 		2) Immutable or non-changeable Strings
 
 Different ways of creating String :
 ====================================================
 
 1. Char name[] = {'J','A','V','A'};
 	String s=new String(name);
 2. String s="JAVA";
 3. String s=new String("JAVA");
 
 Different Ways to Compare Strings :
 ==============================================
 
 1. == -> Strings are compared based on Reference.
 2. equals() -> Strings are compared based on values.
 3. compateTo()-> Strings are compared character by character.
 4. equalsIgnoreCase() -> Strings are compared by ignoring case.
 
 Memory Management in RAM :
 ===============================
 -> in RAM Java Runtime Environment creates four types of Memory.
 		1. Code segment
 		2.Static Segment
 		3.Heap Segment
 		4. Stack Segment
 -> In Heap Segment again Memory will split in two types.
 		1. Constant pool.
 		2. Non Constant pool.
1.Constant pool :
================================
-> Strings that are created without using new keyword are allocated memory on this pool.
-> Duplicates are not allowed .
2.Non Constant pool  :
====================================
-> Strings are created using new keyword are allocated memory on this pool.
-> Duplicates are allowed.
 */
package Strings;

public class String_Basics_01 
{
	public static void main(String[] args)
	{
		String s1="JAVA";
		String s2="JAVA";
		System.out.println(s1==s2); // true i.e References are equal , it will not allows Duplicate values in Constant pool
		
		String s3=new String("JAVA");
		System.out.println(s1==s3); // false i.e References are not equals. S3 created in Non Constant pool.
		
		String s4=new String("JAVA");
		System.out.println(s3==s4); // false i.e References are not equal. So Duplicates are allowed in Non constant pool.
		
	}
}
