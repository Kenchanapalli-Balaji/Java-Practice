/*
 A mobile contains an OS & Charger, Relation ship b/w phone&Charger is Aggregation where as
 Relation ship b/w phone & OS is Composition.
 
 			Charger can exist without phone and therefore it is Aggregation(Loose bound)
 			OS cannot exist without phone and therefore it is composition(Tightly Bound)
 */



class Os
{
	String name;
	int size;
	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}

class Charger
{
	String brand;
	int voltage;
	public Charger(String brand, int voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
}
class Mobile
{
	Os os=new Os("Android",512);
	void hasA(Charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class Aggregation_Composition 
{
	public static void main(String[] args) 
	{
		Charger c=new Charger("Redmi",12);
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
		
	}
}
