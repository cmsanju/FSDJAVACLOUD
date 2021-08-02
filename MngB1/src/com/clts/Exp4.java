package com.clts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exp4 {
	
	public static void main(String[] args) {
		
		Set al = new HashSet();
		
		al.add(10);
		al.add("java");
		al.add(23.45);
		al.add(89.78f);
		al.add("java");
		al.add('A');
		al.add(10);
		al.add(false);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		LinkedHashSet lh = new LinkedHashSet<>();
		
		lh.add(10);
		lh.add("java");
		lh.add(23.45);
		lh.add(89.78f);
		lh.add("java");
		lh.add('A');
		lh.add(10);
		lh.add(false);
		lh.add(null);
		lh.add(null);
		
		System.out.println(lh);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
