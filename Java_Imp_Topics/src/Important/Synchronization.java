package Important;
/*
 -> Synchronization in java is the capability to control the access of 
 	multiple threads to any shared resource.
 -> It is better option where we want to allow only one thread to access the shared resource. 
 */

class TicketBooking
{
	boolean booked = false;
	public synchronized void bookTicket(String name)
	{
		if(booked == false)
		{
			System.out.println(name + " Selected the seat");
			System.out.println(name+ " completed the Payement");
			System.out.println(name+ " Get the Ticket");
		}
		else
		{
			System.out.println("Sorry "+ name+" The seat is already booked");
		}
	}
}

class Threadclass extends Thread
{
	TicketBooking tkt;
	String name;
	Threadclass(TicketBooking obj, String s)
	{
		this.tkt = obj;
		this.name = s;
	}
	public void run() {
		tkt.bookTicket(name);
	}
}
public class Synchronization 
{
	public static void main(String[] args) 
	{
		TicketBooking seat1 = new TicketBooking();
		Threadclass Balaji = new Threadclass(seat1, "Balaji");
		Thread balu = new Thread(Balaji);
		balu.start();
		
		Threadclass Meena = new Threadclass(seat1,"Meena");
		Thread mee = new Thread(Meena);
		mee.start();
	}

}
