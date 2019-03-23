package com.ara.programming.algo.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		// swap largest item with the end item
		int[] nums = {20,35,-15,7,55,1,-22};
		int len = nums.length;
		int unsortedMaxIndex = len-1; //6
		int maxIndex = 0;
		int temp = 0;
		for (int i=unsortedMaxIndex;i>0;i--) {
			temp = nums[i]; // -22
			for (int j=0;j<=i;j++) {
				int curr = nums[j]; // 1
				if (curr>nums[maxIndex]) { //-22>55
					maxIndex = j; //4
				}
			}
			nums[i] = nums[maxIndex];
			nums[maxIndex] = temp;
			maxIndex=0;
		}
		System.out.println(Arrays.toString(nums));
		
	}
}
