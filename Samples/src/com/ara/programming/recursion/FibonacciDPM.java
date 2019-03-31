package com.ara.programming.recursion;

public class FibonacciDPM {

	public static void main(String[] args) {
		System.out.println(fibonacciRec(7));
	}
	
	public static int fibonacciRec(int val) {
		// base
		int[] fibonacciDpm = new int[val+1];
		fibonacciDpm[0] = 1;
		fibonacciDpm[1] = 1;
 
		for (int i=2;i<val+1;i++) {
			fibonacciDpm[i] = fibonacciDpm[i-1] + fibonacciDpm[i-2];
		}
		return fibonacciDpm[val];
	}

}
