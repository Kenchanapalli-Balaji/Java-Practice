package Threads;
class ThreadExample implements Runnable
{	
	String name;
	ThreadExample(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" ->"+i);
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadExample o=new ThreadExample("First");
		Thread tr=new Thread(o);
		tr.setName("First Thread");//setting name for Thread
		System.out.println(tr);
		tr.start();
		
		
		ThreadExample o1=new ThreadExample("Second");
		Thread tr2=new Thread(o1);
		tr2.setName("Second Thread");//setting name for Thread
		System.out.println(tr2);
		tr2.start();
		
	}
}
