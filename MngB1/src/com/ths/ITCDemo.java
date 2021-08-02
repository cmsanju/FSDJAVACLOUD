package com.ths;


class Item
{
	boolean valSet = false;
	int value;
	
	public synchronized void putItem(int i)
	{
		try {
			if(valSet)
			{
				wait();
			}
			
			value = i;
			
			System.out.print("Producer produced one item : "+value);
			
			valSet = true;
			
			notify();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public synchronized void getItem()
	{
		try {
				
			if(!valSet)
			{
				wait();
			}
			
			System.out.println(" --> Conusmer consumed one item : "+value);
			
			valSet = false;
			
			notify();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Producer extends Thread
{
	Item item;
	
	int i;
	
	public Producer(Item item)
	{
		this.item = item;
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				item.putItem(++i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread
{
	Item item;
	
	public Consumer(Item item)
	{
		this.item = item;
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				item.getItem();
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ITCDemo 
{
	public static void main(String[] args) {
		
		Item item = new Item();
		
		Producer pr = new Producer(item);
		
		Consumer cr = new Consumer(item);
		
		pr.start();
		cr.start();	
	}
}
