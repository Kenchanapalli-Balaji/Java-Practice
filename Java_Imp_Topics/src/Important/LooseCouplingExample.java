package Important;

interface Engine1
{
	void start();
}
class DieselEngine implements Engine1
{
	@Override
	public void start() {
		System.out.println("Diesel Engine is starting...");
	}	
}
class PetrolEngine implements Engine1
{
	@Override
	public void start() {
		System.out.println("Petrol Engine is starting....");
	}
}
class ElectricEngine implements Engine1
{
	@Override
	public void start() {
		System.out.println("Electric Engine is starting...");		
	}	
}

class Car1
{
	private Engine1 engine;
	public Car1(Engine1 engine) {
		this.engine=engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is Driving.....");
	}
}
public class LooseCouplingExample 
{
	public static void main(String[] args) {
		Engine1 dieselEngine = new DieselEngine();
		Car1 carWithDieselEngine = new Car1(dieselEngine);
		carWithDieselEngine.drive();
		
		Engine1 electricEngine = new ElectricEngine();
		Car1 carWithElectricEngine = new Car1(electricEngine);
		carWithElectricEngine.drive();
	}
}
