package com.ara.programming.lambda;

import java.util.function.Consumer;

public class FirstLambda {

	public static void main(String[] args) {
		Person pp = new Person("Aravind","Datta",10);
		Consumer<Person> lambda = p -> System.out.println(p);
		lambda.accept(pp);
	}
	
}
