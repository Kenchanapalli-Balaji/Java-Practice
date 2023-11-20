package Threads;

public class Inner_Class_Thread
{
	public static void main(String[] args)
	{
		System.out.println("Main Thread Started");
		Sample obj=new Sample();
		class MyThread1 extends Thread
		{
			public void run() 
			{
				obj.display();
			}
		}
		
		class MyThread2 extends Thread
		{
			public void run() 
			{
				obj.write();
			}
		}
		
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		mt1.start();
		mt2.start();
		System.out.println("Main method ended");
	}
}
class Sample
{
	void display()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Deekshith "+i);
			if(i==3)
			{
				try 
				{
					Thread.sleep(5000);
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
			}	
		}
	}
	
	void write()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Vishnu Vardhan "+i);
		}
	}
}
