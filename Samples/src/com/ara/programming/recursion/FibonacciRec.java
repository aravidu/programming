package com.ara.programming.recursion;

public class FibonacciRec {

	public static void main(String[] args) {
		System.out.println(fibonacciRec(7));
	}
	
	public static int fibonacciRec(int val) {
		// base
		if (val < 2) {
			return 1;
		}
		return fibonacciRec(val-1) + fibonacciRec(val-2);
	}

}
