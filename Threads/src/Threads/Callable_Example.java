/*
Why we need Callable:
=====================
There are two ways of creating threads – one by extending the Thread class and other by 
creating a thread with a Runnable. However, one feature lacking in  Runnable is that we cannot 
make a thread return result when it terminates, i.e. when run() completes. 
For supporting this feature, the Callable interface is present in Java.

Callable vs Runnable  :
======================
->For implementing Runnable, the run() method needs to be implemented which does not 
	return anything, while for a Callable, the call() method needs to be implemented which 
	returns a result on completion. Note that a thread can’t be created with a Callable, 
	it can only be created with a Runnable.
-> Another difference is that the call() method can throw an exception whereas run() cannot.

*/
package Threads;

import java.util.Random;
import java.util.concurrent.Callable;

public class Callable_Example implements Callable
{

	@Override
	public Object call() throws Exception {
		Random generator = new Random();
		int num=generator.nextInt(5);
		Thread.sleep(num * 1000);
		return num; 
	}
	public static void main(String[] args) throws Exception 
	{
		Callable_Example o=new Callable_Example();
		System.out.println(o.call());
	}
	
}
