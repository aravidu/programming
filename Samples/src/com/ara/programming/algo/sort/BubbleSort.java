package com.ara.programming.algo.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// largest one bubbles to the top
		int[] nums = {20,35,-15,7,55,1,-22};
		int len = nums.length;
		int unsortedIndex = len-1; //6
		for (int i=unsortedIndex;i>0;i--) {
			for (int j=0;j<unsortedIndex;j++) {
				int curr = nums[j]; // 55
				int next = nums[j+1]; // -22
				if (curr>next) {
					nums[j]=next;
					nums[j+1]=curr;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}
}
