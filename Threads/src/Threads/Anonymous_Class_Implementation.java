package Threads;

public class Anonymous_Class_Implementation
{
	public static void main(String[] args)
	{
		Thread t1=new Thread()
				{
					public void run()
					{
						for(char ch='a';ch<='z';ch++)
						{
							System.out.println(ch);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
						}
					}
				};
		Thread t2=new Thread()
							{
								public void run()
									{
										for(char ch='A';ch<='Z';ch++)
											{
												System.out.println(ch);
												try {
													Thread.sleep(1000);
												} catch (InterruptedException e) {
													
													e.printStackTrace();
												}
											}
									}
							};
		t1.start();
		t2.start();
	}
}
