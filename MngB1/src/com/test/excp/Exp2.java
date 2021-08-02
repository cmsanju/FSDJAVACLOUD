package com.test.excp;

public class Exp2 {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(20/5);
			
			String[] names = {"java", ".net", "php"};
			
			System.out.println(names[2]);
			
			String name = "admin";
			
			if(name.equals("admin"))
			{
				
			}
			
			String str = "Apple";
			
			System.out.println(str.charAt(2));
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("don't enter zero for den");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check your array size");
		}
		catch(NullPointerException e)
		{
			System.out.println("pls enter name");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check your name length");
		}
		catch(Exception e)
		{
			System.out.println("CHECK YOUR INPUTS");
		}
		
		finally
		{
			System.out.println("i am from finally block");
		}
	}

}
