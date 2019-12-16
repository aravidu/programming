package com.ara.programming.test.ib;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>(5);
		map.put(1,"apple");
		map.put(2,null);
		map.put(new Integer(3),"peach");
		map.put(3,"orange");
		map.put(4,"peach");
		
		for (String v : map.values()) {
			if ("orange".equals(v)) {
				map.put(5,"banana");
			}
		}
		System.out.println(map.get(5));
	}
	
	
}
