package com.ara.programming.algo.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		//sorted array starts with 0
		int[] nums = {20,35,-15,7,55,1,-22};
		int len = nums.length;
		for (int unsortedIndex=1;unsortedIndex<len;unsortedIndex++) {
			int curr = nums[unsortedIndex]; // 35
			for (int sortedIndex=(unsortedIndex-1);sortedIndex>=0;sortedIndex--) {
				int currInSorted = nums[sortedIndex];  //20
				if (curr<currInSorted) {
					// then replace
					int temp = curr;
					nums[unsortedIndex] = currInSorted;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}
}
