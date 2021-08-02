package com.fls;

import java.io.Serializable;

public class Employee implements Serializable
{
	
	public String name;
	
	public String cmp;
	
	public String loc;
	
	public transient int pincode;
	
	public void disp()
	{
		System.out.println("Employee details :: "+name+" "+cmp+" "+loc+" "+pincode);
	}
}
