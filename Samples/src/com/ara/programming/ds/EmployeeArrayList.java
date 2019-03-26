package com.ara.programming.ds;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayList {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Arav", "Datt", 123));
		list.add(new Employee("John", "Doe", 456));
		list.add(new Employee("Macy", "Adams", 23434));
		list.add(new Employee("Foe", "Moe", 344));
		
		list.forEach(System.out::println);
		System.out.println();
		list.forEach(x -> System.out.println(x));
		
		System.out.println();
		Employee[] empArray = list.toArray(new Employee[list.size()]);
		for (Employee e : empArray) {
			System.out.println(e);
		}
	}
}
