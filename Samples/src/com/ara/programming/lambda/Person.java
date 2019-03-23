package com.ara.programming.lambda;

import java.util.Comparator;

public class Person implements Comparator<Person> {
	private String first;
	private String last;
	private int age;

	public Person(String first, String last, int age) {
		this.first = first;
		this.last = last;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [first=" + first + ", last=" + last + ", age=" + age + "]";
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getLast().charAt(0) < o2.getLast().charAt(0)) {
			return -1;
		} else if (o1.getLast().charAt(0) > o2.getLast().charAt(0)) {
			return 1;
		} else
			// assumes equal
			return 0;
	}
}
