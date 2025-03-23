
//Communicating One Thread with another Thread is called InnterThread Communication.
 

package Threads;

public class InterThread_Communication 
{
	public static void main(String[] args) 
	{
		Account ac=new Account(5000);
		Thread wt=new Thread()
				{
					public void run()
					{
						ac.withdraw(8000);
					}
				};
				
		Thread dt1=new Thread()
				{
					public void run()
					{
						ac.deposit(2000);
					}
				};
				
		Thread dt2=new Thread()
				{
					public void run()
					{
						ac.deposit(4000);
					}
				};
		wt.start();
		dt1.start();
		dt2.start();
	}
}
class Account
{
	int balance;
	Account(int balance)
	{
		this.balance=balance;
	}
	
	synchronized void withdraw(int amt)
	{
		if(balance<amt)
		{
			System.out.println("Insufficient Balance");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			withdraw(amt);
			return;
		}
		System.out.println("Withdraw successfully Rs. "+amt);
		balance=balance-amt;
		System.out.println("Available Balance is : "+balance);
		
	}
	
	synchronized void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println("Deposit Successfully");
		System.out.println("Available balance is : "+balance);
		notify();
	}
}
