package com.ths;

class Withdraw
{
	public void withdrawCash()
	{
		System.out.println("Withdraw cash");
	}
}

class Transfer
{
	public void transferCash()
	{
		System.out.println("Transfer cash");
	}
}

public class Exp2 implements Runnable
{
	@Override
	public void run()
	{
		try {
			System.out.println("run()");
		
			Transfer tf = new Transfer();
			tf.transferCash();
		
			Thread.sleep(2000);
		
			Withdraw wd = new Withdraw();
			wd.withdrawCash();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Exp2 t1 = new Exp2();
		
		//t1.start();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
		
	}

}
