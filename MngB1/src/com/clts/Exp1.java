package com.clts;

import java.util.ArrayList;
import java.util.Collection;

public class Exp1 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		int[] ar = {12,34,56,78};// fixed in size 
		
		Collection clt = new ArrayList();// dynamic in nature
		
		clt.add(10);
		clt.add("java");
		clt.add('A');
		clt.add(34.56f);
		clt.add(34.67);
		clt.add(10);
		clt.add(false);
		
		System.out.println(clt);
		
		System.out.println(x);
		
		System.out.println(ar);
	}

}
