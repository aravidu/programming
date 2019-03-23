package com.ara.programming.lambda;

import java.util.Comparator;

public class ComparatorLambda2 {

	public static void main(String[] args) {
		Comparator<String> c = (o1, o2) -> o1.compareTo(o2);

		System.out.println(c.compare("hello", "world"));
		System.out.println(c.compare("aravind", "Datta"));
		System.out.println(c.compare("magic", "king"));
		System.out.println(c.compare("county", "essex"));

	}

}
