package Threads;

public class String_Type_Consructor 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread();
		
			t1.setName("First");
			System.out.println(t1.getName());
		Thread t2=new Thread("Second");// String  type of Constructor 
			System.out.println(t2.getName());
			
		Thread t3=new Thread();
			t3.setName("Third");
			t3.setPriority(1);// we can set priority From 1-10 Only
			System.out.println(t3.getId());
			System.out.println(t3.getName());
			System.out.println(t3.getPriority());
	}
}
