package Threads;

public class Join_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		CapitalLetters1 t1=new CapitalLetters1();
		SmallLetters1 t2=new SmallLetters1();
		t1.start();
		//t1.join(); //it does not allow to create another thread until it finish
		//t1.join(1000); // it will stop another Thread until 1000 milli seconds
		
		//t1.suspend();// it will pause the Thread until it resume
		t1.stop(); // It will dies the Thread..again we can not the Thread if we use stop() method
		t2.start();
		//t1.resume(); // Used to Restart suspended Thread
		
	}
}
class CapitalLetters1 extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class SmallLetters1 extends Thread
{
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}