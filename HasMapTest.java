package com.logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapTest {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		hm.put(110,"Ravi");  
		hm.put(120,"Prateek");  
		hm.put(130, "Davesh");    
		hm.put(140, "Kamal");  
		hm.put(150, "Pawan");  
		Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
		
		/*
		 * Map<Integer, String> map=new HashMap<Integer, String>(); map.put(150,
		 * "Pawan"); System.out.println(it.next());
		 */
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}  
	}
}
