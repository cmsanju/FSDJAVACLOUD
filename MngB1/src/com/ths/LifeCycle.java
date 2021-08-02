package com.ths;

public class LifeCycle extends Thread
{
	@Override
    public void run()
    {
		try 
		{
			Thread.sleep(1000);
			
			System.out.println("i am from run()");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	
    }
	
	public static void main(String[] args) throws Exception
	{
		
		LifeCycle t1 = new LifeCycle();
		
		System.out.println("Before starting thread state : "+t1.getState());
		System.out.println("Before starting thread status : "+t1.isAlive());
		
		t1.start();
		System.out.println("After starting thread state : "+t1.getState());
		System.out.println("After starting thread status : "+t1.isAlive());
		
		System.out.println("In sleep thread state :"+t1.getState());
		System.out.println("In seep thread status : "+t1.isAlive());
		
		t1.join();
		
		System.out.println("after join thread state : "+t1.getState());
		System.out.println("after join thread status : "+t1.isAlive());
	}
}
