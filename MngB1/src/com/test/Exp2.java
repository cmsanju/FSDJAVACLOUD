package com.test;

public class Exp2 {
	
	public static void main(String[] args) {
		//auto boxing converting from primitive to corresponding wrapper class type
		int x = 400;
		
		Integer obj = new Integer(x);
		
		System.out.println(x);
		System.out.println(obj);
		
		//auto un-boxing converting corresponding wrapper class to primitive type
		
		Double d = new Double(200);
		
		double y = d;
		
		System.out.println(d);
		System.out.println(y);
		
	}

}
