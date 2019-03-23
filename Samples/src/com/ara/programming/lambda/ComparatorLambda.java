package com.ara.programming.lambda;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println(c.compare("hello", "world"));

	}

}
