package com.clts;

import java.util.Stack;

public class Exp3 {
	
	public static void main(String[] args) {
		
		Stack al = new Stack();
		
		al.add(10);
		al.add("java");
		al.add(23.45);
		al.add(89.78f);
		al.add("java");
		al.add('A');
		al.add(false);
		
		System.out.println(al);
		
		System.out.println(al.peek());
		
		al.push("morning");
		
		System.out.println(al);
		
		System.out.println(al.pop());
		System.out.println(al);
		
		System.out.println(al.search(100));
		
		System.out.println(al.empty());
	}

}
