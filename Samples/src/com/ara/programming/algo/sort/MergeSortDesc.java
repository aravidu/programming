package com.ara.programming.algo.sort;

import java.util.stream.IntStream;

public class MergeSortDesc {

	public static void main (String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		// end is always +1 than the last valid index in array
		mergeSortDesc(intArray, 0, intArray.length);
		
		IntStream.of(intArray).forEach(x -> System.out.println(x));
		IntStream.of(intArray).forEach(System.out::println);
	}
	
	// end is always +1 than the last valid index in array
	public static void mergeSortDesc(int[] input, int startIndex, int endIndex) {
		
		// base condition
		if ((endIndex - startIndex) < 2) {
			return; 
		}
		int midIndex = (startIndex + endIndex) / 2; // 3
		mergeSortDesc(input, startIndex, midIndex); // always +1 than the last valid index in array = (0, 3)
		mergeSortDesc(input, midIndex, endIndex);
		// always merge sorted partitions
		merge(input, startIndex, midIndex, endIndex);
	}
	
	public static void merge(int[] input, int startIndex, int midIndex, int endIndex) {
		if (input[midIndex - 1] >= input[midIndex]) {
			return;
		}
		
		int i = startIndex;
		int j = midIndex;
		int tempIndex = 0;
		
		int[] tempArray = new int[endIndex - startIndex];
		
		while (i < midIndex && j < endIndex) {
			tempArray[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
		}
		
		// {34, 32}, {36, 33}
		// 36, 34, 33, 
		
		System.arraycopy(input, i, input, startIndex + tempIndex, midIndex - i);
		System.arraycopy(tempArray, 0, input, startIndex, tempIndex);
	}
}
