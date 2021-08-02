package com.fls;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	
	public static void main(String[] args) throws Exception
	{
		
		FileOutputStream fos = new FileOutputStream("src/employee.txt");
		
		ObjectOutputStream objs = new ObjectOutputStream(fos);
		
		Employee e = new Employee();
		
		e.name = "Java";
		e.cmp = "Oracle";
		e.loc = "Blr";
		e.pincode = 123123;
		
		objs.writeObject(e);
		
		System.out.println("Done.");
		
		e.disp();
	}

}
