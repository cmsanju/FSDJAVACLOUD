package com.test.excp;

public class Exp3 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(30/0);
		}
		catch(Exception e)
		{
			//using getMessage()
			System.out.println(e.getMessage());
			
			//printing the exception class object
			System.out.println(e);
			
			//using printStackTrace()
			e.printStackTrace();
		}
		
	}//How to deal with unknown exceptions in java
}
/*
	1 Multithreading (2)
	2 Collection framework(2)
	3 file handling (1)

*/