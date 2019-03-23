package com.ara.programming.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class MyCallableService {

	public static void main (String args[]) {
		ExecutorService svc = Executors.newScheduledThreadPool(10);
		for (int i=0;i<1;i++) {
			svc.submit(new MyTask4<Integer>());
		}
		//svc.shutdownNow();
		
		//Function f = f
	}
}

class MyTask4<Integer> implements Callable<MyTask4> {
	public MyTask4<Integer> call() {
		for (int i=0;i<1;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("do something.. "+i+"by: "+Thread.currentThread().getName() );
		}
		return null;
	}
}
