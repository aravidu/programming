package com.ara.programming.threads;

public class CheckCores {

	public static void main (String args[]) {
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
	}
}

class MyThread implements Runnable {
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("do something.. "+i);
		}
	}
}
