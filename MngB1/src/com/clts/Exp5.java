package com.clts;

import java.util.TreeSet;

public class Exp5 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> al = new TreeSet<>();
		
		al.add(10);
		al.add(22);
		al.add(45);
		al.add(89);
		al.add(30);
		al.add(489);
		al.add(200);
		al.add(32);
		al.add(1);
		al.add(5);
		
		System.out.println(al);
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("java");
		ts.add("apple");
		ts.add("sony");
		ts.add("mpl");
		ts.add("blr");
		ts.add("tpt");
		ts.add("nellore");
		ts.add("chennai");
		ts.add("hyd");
		ts.add("Blr");
		//ts.add(null);//error
		
		System.out.println(ts);
	}

}
