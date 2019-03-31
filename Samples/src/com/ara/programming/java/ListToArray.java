package com.ara.programming.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Integer[] arr = list.toArray(new Integer[list.size()]);
//		System.out.println(arr.);
//		System.out.println(.strea(arr));
	}

}
