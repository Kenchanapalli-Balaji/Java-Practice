package IEVOVLE.copy;
import java.util.*;
class Vehicle
{
	int number;
	String name;
	double price;
	Vehicle (int number, String name, double price)
	{
		this.number=number;
		this.name=name;
		this.price=price;
	}
	
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number=number;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
}

class VehicleInformation
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number Of Objects");
		int n=sc.nextInt();
		sc.nextLine();
		Vehicle[] v=new Vehicle[n];
		for(int i=0;i<v.length;i++)
		{
			System.out.println("Enter the Vehicle Number");
			int number=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the vehicle Name");
			String name=sc.nextLine();
			System.out.println("Enter the Vehicle Price");
			double price=sc.nextDouble();
			sc.nextLine();
			 v[i]= new Vehicle(number,name,price);
		}
		System.out.println("Enter the Vehicle NAME For Searching ");
		String sname=sc.nextLine();
		Vehicle vr=findVehicleWithMinimumPrice(v);
		if(vr==null)
		{
			System.out.println("No Vehicle found with mentioned Attribute");
		}
		else
		{
			System.out.println("number "+ vr.getNumber());
			System.out.println("Name "+vr.getName());
			System.out.println("price "+vr.getPrice());
		}
		Vehicle r=searchVehicleByName(v,sname);
		if(r==null)
		{
			System.out.println("No Vehicle found with mentioned attribute");
			
		}
		else
		{
			System.out.println("number "+ r.getNumber());
			System.out.println("Name "+r.getName());
			System.out.println("price "+r.getPrice());
		}
		
	}
	
	public static Vehicle searchVehicleByName(Vehicle[] v, String sname)
	{
		int pos=-1;
		for(int i=0;i<v.length;i++)
		{
			if(v[i].getName().equalsIgnoreCase(sname));
			{
				pos=i;
			}
		}
		if(pos==-1)
			return null;
		else
			return v[pos];
		
	}
	
	public static Vehicle findVehicleWithMinimumPrice(Vehicle[] v)
	{
		Vehicle p=v[0];
		double min=v[0].getPrice();
		for(int i=0;i<v.length;i++)
		{
			if(v[i].getPrice()<min)
			{
				min=v[i].getPrice();
				p=v[i];
			}
		}
		if(min!=0)
			return p;
		else
			return null;
	}
}