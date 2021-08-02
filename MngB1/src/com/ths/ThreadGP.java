package com.ths;

public class ThreadGP implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("I AM FROM RUN() : "+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ThreadGP t1 = new ThreadGP();
		
		ThreadGroup tg1 = new ThreadGroup("Bank");
		
		Thread t2 = new Thread(tg1, t1, "Transfer");
		Thread t3 = new Thread(tg1, t1, "Withdraw");
		Thread t4 = new Thread(tg1, t1, "Credit");
		
		ThreadGroup tg2 = new ThreadGroup("Math");
		
		Thread t5 = new Thread(tg2, t1, "Add");
		Thread t6 = new Thread(tg2, t1, "Sub");
		Thread t7 = new Thread(tg2, t1, "Div");
		
		t3.start();
		t4.start();
		System.out.println("Tg1 : "+tg1.activeCount());
		t5.start();
		t6.start();
		System.out.println("Tg2 : "+tg2.activeCount());
		
	}
}
