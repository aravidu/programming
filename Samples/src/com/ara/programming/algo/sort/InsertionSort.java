package com.ara.programming.algo.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertionSort {

	// incomplete
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];
			
			recursiveInsertionSort(intArray, firstUnsortedIndex);
		}

		System.out.println(Arrays.toString(intArray));
		IntStream.of(intArray).forEach(x -> System.out.print(x + ","));
	}

	private static void recursiveInsertionSort(int[] intArray, int firstUnsortedIndex) {
		int i;

		for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > 0; i--) {
			intArray[i] = intArray[i - 1];
		}

		intArray[i] = 0;
		
	}

}
