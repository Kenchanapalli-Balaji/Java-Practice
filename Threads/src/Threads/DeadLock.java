package Threads;

public class DeadLock 
{
	int a; int b;
	DeadLock(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	synchronized void  display()
	{
		System.out.println("A value is : "+a);
		System.out.println("B value is : "+b);
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
		System.out.println("Sum is :"+(a+b));
		System.out.println("Difference is :"+(a-b));
		System.out.println("Multiple is :"+a*b);
	}
	synchronized void update()
	{
		this.a=a+100;
		this.b=b+100;
	}
	public static void main(String[] args) {
		DeadLock d =new DeadLock(10, 20);
		Thread t1= new Thread() {
								public void run()
								{
									d.display();
								}
							};
		Thread t2= new Thread() {
								public void run()
								{
									d.update();
								}
							};
		t1.start();
		t2.start();
	}
}
