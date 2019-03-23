package com.ara.programming.lambda;

import java.util.stream.IntStream;

public class SmallestInt {

	public static void main(String[] args) {
		int[] numbers = {23,234,345,34,3,2342,234,2342,34,10,3,43,123131,123};
		int min = numbers[0];
		for (int i=0;i<numbers.length;i++) {
			int curr = numbers[i];
			if (curr<min) {
				min = curr;
			}
		}
		System.out.println("Min using iter: "+min);
		
		IntStream.of(numbers).min();
		System.out.println("Min using streams: "+IntStream.of(numbers).min().getAsInt());
		System.out.println("Min using streams: "+IntStream.of(numbers).sum());
		System.out.println("Min using streams: "+IntStream.of(numbers).asDoubleStream());
		System.out.println("Min using streams: "+IntStream.of(numbers).asLongStream());
		System.out.println("Min using streams: "+IntStream.of(numbers).average().getAsDouble());
		System.out.println("Min using streams: "+IntStream.of(numbers).findAny());
		System.out.println("Min using streams: "+IntStream.of(numbers).asDoubleStream());

	}

}
