package Threads;

class TicketBooking
{
	 boolean booked=false;
	public synchronized void bookTicket(String name)
	{
		if(booked==false)
		{
		System.out.println(name+":->Selected the Seat");
		System.out.println(name+":-> completed the payment");
		System.out.println(name+":-> Get the Ticket");
		booked=true;
		}
		else
			System.out.println("Sorry "+name+" This seat already Booked");
		
	}
}
 class ThreadClass extends Thread
 {
	 TicketBooking tkt;
	 String name;
	 ThreadClass(TicketBooking obj,String s)
	 {
		 tkt=obj;
		 name=s;
	 }
	 public void run()
	 {
		 tkt.bookTicket(name);
	 }
 }
public class SyncronizationEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		TicketBooking seat10=new TicketBooking();
		ThreadClass Balaji=new ThreadClass(seat10,"Ramesh");
		Thread balu=new Thread(Balaji);
		balu.start();
		//balu.join();
		ThreadClass Meena=new ThreadClass(seat10,"Suresh");
		Thread mee=new Thread(Meena);
		mee.start();		
	}
}




/*
 * class Arthematic
{
	int a; int b;
	Arthematic (int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	 synchronized void display()
	{
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		try
		{
			//Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("sum is "+(a+b));
		System.out.println("Diffrerence is "+(a-b));
		System.out.println("Multiplication is "+(a*b));
	}
	
	synchronized void update()
	{
		this.a=a+90;
		this.b=b+80;
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Arthematic o1=new Arthematic(10,20);
		Thread t1=new Thread()
				{
					public void run()
					{
						o1.display();
					}
				};
				Thread t2=new Thread()
				{
					public void run()
					{
						o1.update();
					}
				};
				
		t1.start();
		t2.start();
		
	}
}
*/
