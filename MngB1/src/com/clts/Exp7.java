package com.clts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp7 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> hm = new TreeMap<>();
		
		hm.put("lenovo", 1000);
		hm.put("sony", 3000);
		hm.put("asus", 4000);
		hm.put("dell", 5450);
		hm.put("sony", 6000);
		hm.put("apple", 3456);
		
		System.out.println(hm);
		
		Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println("Prodcut : "+et.getKey()+" Price : "+et.getValue());
		}
	}
}
