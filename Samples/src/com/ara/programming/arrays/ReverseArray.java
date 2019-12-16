package com.ara.programming.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		
		int j=arr.length-1;
		for (int i=0;i<arr.length/2;i++) {
			System.out.println("i: "+i+", arrval: "+arr[i]+", j: "+j);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
		}
	}
}
