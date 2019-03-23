package com.ara.programming.threads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIMinIntegerSort {

	public static void main(String args[]) {
		Integer[] arr = {322,3453543, 4564564, 54564, 56532234, 34532, 32434};
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		System.out.println(list.get(0));
		
		int[] arr1 = {1,2,6,4,2,56,8,2,1,4};
		Arrays.sort(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1);
	}
}
