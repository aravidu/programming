package com.ara.programming.algo;

public class FizzBuzz {

	public static void main(String[] args) {
		boolean isFizz = false;
		boolean isBuzz = false;
		
		for (int i=1;i<=100;i++) {
			if (i%3 == 0) {
				isFizz = true;
				System.out.println("Fizz");
			}
			if (i%5 == 0) {
				isBuzz = true;
				System.out.println("Buzz");
			}
			if (!isFizz && !isBuzz) {
				System.out.println(i);
			}
			if (isFizz && isBuzz) {
				System.out.println("FizzBuzz");
			}
			isFizz = false;
			isBuzz = false;
		}
	}

}
