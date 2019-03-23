package com.ara.programming.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Charles", "Dickens", 73),
				new Person("Aravind", "Datta", 40),
				new Person("Kevin", "Peterson", 30),
				new Person("Nancy", "Pelosi", 76),
				new Person("Marvin", "Cughes", 80));
		Collections.sort(persons,new PersonComparator());
		print(persons);
		cPrinter(persons);
	}
	
	public static void print(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p.toString());
		}
	}
	
	public static void cPrinter(List<Person> persons) {
		for (Person p : persons) {
			if ('c' == p.getLast().toLowerCase().charAt(0)) {
				System.out.println(p.toString());
			}
		}
	}
	

}
