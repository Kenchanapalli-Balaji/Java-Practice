package Stream_API;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;String name; int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}
public class FilterDemo3
{
	public static void main(String[] args) 
	{
		List<Product> products=new ArrayList<>();
		products.add(new Product(1,"HP Laptop",45000));
		products.add(new Product(2,"DELL Laptop",35000));
		products.add(new Product(3,"Lenovo Laptop",25000));
		products.add(new Product(4,"Apple Laptop",20000));
		
		products.stream()
						 .filter(p->p.price>25000)            // filtering
						 .forEach(p->System.out.println(p));  // iterating the Objects
	}
}
