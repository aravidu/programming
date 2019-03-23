package com.ara.programming.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("running.. "+Thread.currentThread().getName());
		
		// this step will create 10 threads
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for (int i=0;i<100;i++) {
			System.out.println("task "+i);
			service.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("now task done by "+Thread.currentThread().getName());
				}
			});
		}
		System.out.println("running.. "+Thread.currentThread().getName());
		service.shutdown();
	}

}

