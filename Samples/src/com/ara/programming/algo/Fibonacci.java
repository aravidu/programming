package com.ara.programming.algo;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibRec(9));//1,1,2,3 4 = 5+4
		System.out.println(fibNonRec(9));//1,1,2,3 4 = 5+4
	}
	
	public static int fibRec(int n) {
		if (n==0 || n==1) {
			return n;
		}
		return fibRec(n-1) + fibRec(n-2);
	}

	public static int fibNonRec(int n) {
		int[] arr = new int[n+2];
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i=2;i<=n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
}
