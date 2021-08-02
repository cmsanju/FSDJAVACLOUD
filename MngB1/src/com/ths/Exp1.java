package com.ths;

public class Exp1 extends Thread
{
	public void run()
	{
		System.out.println("I AM FROM RUN()");
	}
	
	public static void main(String[] args) {
		
		Exp1 t1 = new Exp1();
		Exp1 t2 = new Exp1();
		Exp1 t3 = new Exp1();
		Exp1 t4 = new Exp1();
		Exp1 t5 = new Exp1();
		
		System.out.println("Min : "+MIN_PRIORITY);//1
		System.out.println("Norm : "+NORM_PRIORITY);//5
		System.out.println("Max : "+MAX_PRIORITY);//10
		
		System.out.println("Default thread name : "+t1.getName());
		System.out.println("Default thread name : "+t2.getName());
		System.out.println("Default thread name : "+t3.getName());
		System.out.println("Default thread name : "+t4.getName());
		System.out.println("Default thread name : "+t5.getName());
		
		System.out.println("Default thread priority : "+t1.getPriority());
		System.out.println("Default thread priority : "+t2.getPriority());
		System.out.println("Default thread priority : "+t3.getPriority());
		System.out.println("Default thread priority : "+t4.getPriority());
		System.out.println("Default thread priority : "+t5.getPriority());
		
		t1.setName("account open");
		t2.setName("withdraw");
		t3.setName("credit");
		t4.setName("transfer");
		t5.setName("delete");
		
		System.out.println("After setting thread name : "+t1.getName());
		System.out.println("after setting thread name : "+t2.getName());
		System.out.println("after setting thread name : "+t3.getName());
		System.out.println("after setting thread name : "+t4.getName());
		System.out.println("after setting thread name : "+t5.getName());
		
		t1.setPriority(MAX_PRIORITY);
		
		System.out.println("after setting thread priority : "+t1.getPriority());
	}
}
