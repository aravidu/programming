package com.ara.programming.algo;

public class Fibonacci {

	public static void main(String[] args) {
		// 0,1,2,3,4,5,6 ,7, 8
		// 1,1,2,3,5,8,13,21,34
		System.out.println(fib(6));
	}
	
	private static int fib(int n) {
		return n==1 || n==0 ? 1 : fib(n-1) + fib(n-2);
	}
	
}
