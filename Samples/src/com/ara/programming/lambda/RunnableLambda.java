package com.ara.programming.lambda;

public class RunnableLambda {

	public static void main(String[] args) {
		Thread myThread = new Thread(() -> System.out.println("printing from lambda"));
		myThread.start();

	}

}
