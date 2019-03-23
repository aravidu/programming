package com.ara.programming.lambda;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.getLast().compareTo(o2.getLast());
	}
}
