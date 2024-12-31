package Important;

import java.util.Scanner;

class Trip
{
	Traveller t;
	public Trip() {
		System.out.println("1.Car \n2.Bike \n3.Flight");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
			{
			case 1: t = new Traveller(new Car2());
						break;
			case 2: t = new Traveller(new Bike());
					break;
			case 3: t = new Traveller(new Flight());
					break;
			default:System.out.println("Better go by walk");
					System.exit(0);
					break;
			}
	}
	void start()
	{
		t.journey();
	}
}
class Traveller
{
	private Vehicle v;
	Traveller(Vehicle v){
		this.v=v;
	}
	void journey()
	{
		v.move();
	}
}
interface Vehicle
{
	void move();
}
class Bike implements Vehicle
{
	public void move() {
		System.out.println("Moving by Riding the Bike");
	}
}
class Car2 implements Vehicle
{
	public void move() {
		System.out.println("Moving By Driving the Car");
	}
}
class Flight implements Vehicle
{
	public void move() {
		System.out.println("Moving By Flying the Flight");
	}
}

public class LooseCouplingExample2 
{
	public static void main(String[] args) {
		Trip t = new Trip();
		t.start();
	}

}
