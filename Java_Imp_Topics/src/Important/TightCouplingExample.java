package Important;
/*
-> In tight coupling, classes are highly dependent on one another. 
   Changes in one class often require changes in the dependent class.
-> The Car class is tightly coupled with the Engine class. If you want to use a different type of engine 
	(e.g., ElectricEngine), you must modify the Car class.
*/

class Engine
{
	public void start() {
		System.out.println("Engine is Starting....");
	}
}
class Car{
	private Engine engine;  // Tight coupling as Car depends directly on Engine
	public Car() {
		this.engine = new Engine(); // Dependency is created inside the class
	}
	public void drive() {
		engine.start();
		System.out.println("Car is Driving.....");
	}
}
public class TightCouplingExample {
	public static void main(String[] args) {
		Car c= new Car();
		c.drive();
	}

}
