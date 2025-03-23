package Threads;

public class Runnable_Interface implements Runnable
{
	public void run()
	{
		System.out.println("From Another Thread"+Thread.currentThread());
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Runnable_Interface obj=new Runnable_Interface();
		Thread t1=new Thread(obj); // Another constructor of Thread Class
		t1.start();
		System.out.println("From Main Thread"+Thread.currentThread());// Gives the Instance of Thread Name
	}
}
