package com.ara.programming.algo;

public class ProductArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		
//		int[] parr = new int[arr.length];
//		int k = 0;
//		for (int i=0;i<arr.length;i++) { // 2
//			int val = 1;
//			for (int j=0;j<arr.length;j++) { // 1
//				if (i==j) {
//					continue;
//				} else {
//					val *= arr[j]; //
//					parr[k] = val;
//				}
//				//System.out.println("i: " + i + ", j: "+j+ ", k: "+k+ ", val: "+val);
//			}
//			k++;
//		}
//		
//		for (int i : parr) {
//			System.out.print(i+",");
//		}
		
//		int tmul = 1;
//		for (int i=0;i<arr.length;i++) {
//			tmul *= arr[i];
//		}
//		System.out.println(tmul);
//		
//		int[] parr = new int[arr.length];
//		for (int i=0;i<arr.length;i++) {
//			parr[i] = tmul / arr[i];
//		}
//
//		for (int i : parr) {
//			System.out.print(i+",");
//		}
		
		int[] before = new int[arr.length];
		int[] after = new int[arr.length];
		
		int bmul = 1;
		int amul = 1;
		for (int i=0;i<arr.length;i++) { //1,2,3,4
			for (int j=0;j<i;j++) {
				bmul *= arr[j];
			}
			before[i] = bmul;
			bmul = 1;
			for (int k=i+1;k<arr.length;k++) {
				amul *= arr[k];
			}
			after[i] = amul;
			amul = 1;
		}
		
		for (int i : before) {
			System.out.print(i+",");
		}
		
		for (int i : after) {
			System.out.print(i+",");
		}

		int[] parr = new int[arr.length];
		for (int i=0;i<arr.length;i++) {
			parr[i] = before[i]*after[i];
		}
		System.out.println();
		for (int i : parr) {
			System.out.print(i+",");
		}
		
	}

}
