package com.ara.programming.test.ib;

public abstract class Car {
	private int myNumDoors;
	public Car(int numDoors) {
		myNumDoors = numDoors;
	}
	public abstract int maxNumPass();
}
