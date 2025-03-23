package Threads;

import java.util.concurrent.Callable;

public class Demo  implements Callable,Runnable
{
	void fun()
	{
		System.out.println("hello world...!");
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.fun();
	}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
