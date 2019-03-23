package com.ara.programming.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyScheduledThreadPool {

	public static void main (String args[]) {
		ExecutorService svc = Executors.newScheduledThreadPool(10);
		for (int i=0;i<1;i++) {
			svc.execute(new MyTask3());
		}
		//svc.shutdownNow();
	}
}

class MyTask3 implements Runnable {
	@Override
	public void run() {
		for (int i=0;i<1;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("do something.. "+i+"by: "+Thread.currentThread().getName() );
		}
	}
}
