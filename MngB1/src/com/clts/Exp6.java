package com.clts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exp6 {
	
	public static void main(String[] args) {
		
		Map m = new HashMap<>();
		
		m.put(10, "java");
		m.put("id", 12);
		m.put('A', "java");
		m.put("name", "apple");
		m.put(1, 300);
		m.put(10, "lenovo");
		
		System.out.println(m);
		
		Map<String, Integer> hm = new HashMap<>();
		
		hm.put("Lenovo", 1000);
		hm.put("sony", 3000);
		hm.put("asus", 4000);
		hm.put("dell", 5450);
		hm.put("sony", 6000);
		hm.put("apple", 3456);
		
		System.out.println("HashMap Data "+hm);
		
		Map<String, Integer> ht = new Hashtable<>();
		
		ht.put("Lenovo", 1000);
		ht.put("sony", 3000);
		ht.put("asus", 4000);
		ht.put("dell", 5450);
		ht.put("sony", 6000);
		ht.put("apple", 3456);
		
		System.out.println("Hashtable Data "+ht);
		
		Map<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Lenovo", 1000);
		lhm.put("sony", 3000);
		lhm.put("asus", 4000);
		lhm.put("dell", 5450);
		lhm.put("sony", 6000);
		lhm.put("apple", 3456);
		
		System.out.println(lhm);
		
		Iterator<Entry<String, Integer>> itr = lhm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
		for(String k : lhm.keySet())
		{
			System.out.println(k+" "+lhm.get(k));
		}
		
		for(Integer v : lhm.values())
		{
			System.out.println(v+" "+lhm.containsValue(v));
		}
	}

}
