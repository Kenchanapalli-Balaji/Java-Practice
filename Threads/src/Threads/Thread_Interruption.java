/* 
 Thread Interruption is occurs when one source is used by multiple Threads. 
 It is called Deadlock.
 
 To Avoid this Interruption /Deadlock wehave to use synchronized Method/Block.
 */
package Threads;

public class Thread_Interruption 
{
	public static void main(String[] args) 
	{
		Arthimetic obj=new Arthimetic(10,20);
		Thread t1=new Thread()
				{
					public void run()
					{
						obj.display();
					}
				};
		Thread t2=new Thread()
				{
					public void run()
					{
						obj.update();
					}
				};
		t1.start();
		t2.start();
	}
}
class Arthimetic
{
	int a,b;
	Arthimetic(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
synchronized void display()
	{
		System.out.println("A value is : "+a);
		System.out.println("B Value is : "+b);
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Sum is : "+(a+b));
		System.out.println("Difference is : "+(a-b));
		System.out.println("Multiplication is : "+ a*b);
	}
synchronized void update()
	{
		this.a=a+100;
		this.b=b+100;
	}
}
