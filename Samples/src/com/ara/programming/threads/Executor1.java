package com.ara.programming.threads;

public class Executor1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("running.. "+Thread.currentThread().getName());
		Thread mythread = null;
		for (int j=0;j<10;j++) {
			System.out.println(Thread.currentThread().getName()+" thread creating new threads..");
			mythread = new Thread(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName()+" started executing task..");
				}
			});
			mythread.start();
		}
		mythread.join();
		System.out.println("running.. "+Thread.currentThread().getName());
	}

}

