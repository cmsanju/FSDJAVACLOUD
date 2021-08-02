package com.fls;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialDemo {
	
	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fis = new FileInputStream("src/employee.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee)ois.readObject();
		
		System.out.println("Name : "+e.name+" Company : "+e.cmp+" Location : "+e.loc+" Pincode : "+e.pincode);
	}

}
