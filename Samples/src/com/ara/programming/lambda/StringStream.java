package com.ara.programming.lambda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		String s = "hello my name is anthony d'andres";
		System.out.println(Stream.of(s.split(",")).map (elem -> new String(elem))
			      .collect(Collectors.toList()));
	}

}
