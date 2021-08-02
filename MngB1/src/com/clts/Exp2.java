package com.clts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exp2 
{
	public static void main(String[] args) {
		
		//Collection al = new ArrayList();
		//List al = new ArrayList();
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("java");
		al.add(23.45);
		al.add(89.78f);
		al.add("java");
		al.add('A');
		al.add(false);
		
		System.out.println(al);
		
		List ll = new LinkedList();
		
		ll.add(10);
		ll.add("java");
		ll.add(23.45);
		ll.add(89.78f);
		ll.add("java");
		ll.add('A');
		ll.add(false);
		
		System.out.println(ll);
		
		//Iterator itr = al.iterator(); //parent 
		
		ListIterator ltr = al.listIterator();// child 
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}
}
