package com.ara.programming.algo;

import java.util.ArrayList;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4};
		List<Integer> numbers = new ArrayList<>(ar.length);
        for (int i=0;i<ar.length;i++) {
            numbers.add(ar[i]);
        }
        int val = 0;
        for (Integer num : numbers) {
        	val+=num;
        }
        System.out.println(val);
	}

}
