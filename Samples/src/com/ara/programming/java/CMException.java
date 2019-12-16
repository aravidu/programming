package com.ara.programming.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CMException {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("123");
		list.add("456");
		list.add("789");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String value = iterator.next();

			if (value.equals("456")) {
				String val = list.get(1);
				System.out.println(val);
				list.add(1, "abc");
			}
		}

	}

}
