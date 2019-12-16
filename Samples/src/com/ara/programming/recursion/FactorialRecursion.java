package com.ara.programming.recursion;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n) {
		return n==0 || n==1 ? 1 : n*factorial(n-1);
	}

}
