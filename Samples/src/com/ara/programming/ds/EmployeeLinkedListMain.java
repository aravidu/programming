package com.ara.programming.ds;

public class EmployeeLinkedListMain {

	public static void main(String[] args) {
		EmployeeSinglyList list = new EmployeeSinglyList();
		list.addToFront(new Employee("Arav", "Datt", 123));
		list.addToFront(new Employee("John", "Doe", 456));
		list.addToFront(new Employee("Macy", "Adams", 23434));
		list.addToFront(new Employee("Foe", "Moe", 344));
		
		list.printList();
	}
}
