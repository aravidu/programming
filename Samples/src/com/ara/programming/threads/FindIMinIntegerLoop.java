package com.ara.programming.threads;

public class FindIMinIntegerLoop {

	public static void main(String args[]) {
		int[] arr = {2,3,4,4,3,6,-1,3,5,2,7,3};
		int min = 0;
		for (int i=0;i<arr.length;i++) {
			if (i==0) {
				min = arr[i];
			} else {
				if (arr[i] < min) {
					min = arr[i];
				}
			}			
		}
		System.out.println(min);
	}
}
