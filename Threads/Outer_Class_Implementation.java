package Threads;

public class Outer_Class_Implementation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread t1=new SmallLetters();
		Thread t2=new CapitalLetters();
		t1.start();
		t1.join();  // It will not allow to create new Thread until t1 thread dies
		t2.start();
	}
}
class SmallLetters extends Thread
{
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}


class CapitalLetters extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
