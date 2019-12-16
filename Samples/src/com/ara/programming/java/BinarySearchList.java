package com.ara.programming.java;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchList {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");

		String val = map.compute("one", (key, value) -> value == null ? null : value.toString().toUpperCase());
		System.out.println(val);
	}

}
