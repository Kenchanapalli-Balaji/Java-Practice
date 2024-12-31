package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Arithemetic
{
	int a; int b;
	public Arithemetic(int a, int b) {this.a=a; this.b=b;}
	synchronized void display() {
		System.out.println("A value is : "+a);
		System.out.println("B value is :"+b);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Sum is : "+a+b);
			System.out.println("Multiplication is : "+a*b);
		}
	}
 synchronized void update()
	{
		this.a = a+100;
		this.b = b+100;
	}
	
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Arithemetic a = new Arithemetic(2,5);
		Thread t1= new Thread() {
			public void run()
			{
				a.display();
			}
		};
		Thread t2= new Thread() {
			public void run()
			{
				a.update();
			}
		};
		t1.start();
		t2.start();
	}
}
